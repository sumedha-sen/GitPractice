package com.te.sprmvc.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.sprmvc.beans.EmployeeBean;

import com.te.sprmvc.dao.EmployeeDao;
import com.te.sprmvc.service.EmpService;

@Controller
public class FormController {
	
//	@Autowired
//	private EmployeeDao dao;
	
	@Autowired
	EmpService service;
	
	
	
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dateEditor=new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true);
		binder.registerCustomEditor(Date.class,dateEditor);
		
		
	}
	
	@GetMapping("/login0")
	public String getLoginForm() {
		return "loginForm";
	}
	
	
	@GetMapping("/searchForm")
	public String getSearchForm(ModelMap map,HttpSession session) {
		if(session.getAttribute("emp")!=null) {
			return "searchForm";
			
		}else {
			map.addAttribute("errMsg","pls login first");
			return "loginForm";
			
		}
		
	}
	
	@GetMapping("/showdelete")
	public String getDeleteForm(ModelMap map,HttpSession session) {
		if(session.getAttribute("emp")!=null) {
			return "deleteForm";
			
		}else {
			map.addAttribute("errMsg","pls login first");
			return "loginForm";
			
		}
		
	}
	
	@GetMapping("/add")
	public String getAddEmp(ModelMap map,@SessionAttribute(name="emp", required=false) EmployeeBean bean) {
		if(bean!=null) {
			return "addEmployees";
			
		}else {
			map.addAttribute("errMsg","pls login first");
			return "loginForm";
			
		}
		
	}
	
	
	@PostMapping("/addemp")
	public String addEmployee(ModelMap map,@SessionAttribute(name="emp",required = false)EmployeeBean employeebean,EmployeeBean bean) {
		if(employeebean!=null) {
			
			if(service.addEmployee(bean)) {
				map.addAttribute("msg", "Added successfully");
			}else {
				map.addAttribute("msg", "something went wrong");
			}
			return "addEmployees";
		}else {
			map.addAttribute("errmsg", "Login First");
		}
		return "loginForm";	
	}
	
	
	// update
	

	@GetMapping("/update")
	public String getUpdateForm(ModelMap map,@SessionAttribute(name="emp",required = false)EmployeeBean bean) {
		if(bean!=null) {
			map.addAttribute("eid", bean.getId());
			return"updateForm";
		}else {
			map.addAttribute("errmsg","Login First");
			return "loginForm";
		} 
		
	}
	

	//@RequestMapping(value="/update1",  method=RequestMethod.POST)
	
	@PostMapping("/update")
	public String updateEmp(@SessionAttribute(name="emp", required = false)EmployeeBean employeebean,EmployeeBean bean,ModelMap map) {
		
		if(employeebean!=null) {
			if(service.updateEmp(bean)) {
				map.addAttribute("eid", employeebean.getId());
				map.addAttribute("msg", "Updated Successfully");
			}
			else {
				map.addAttribute("msg", "Something went Wrong");
			}
			return "updateForm";
		}else {
			map.addAttribute("errmsg", "Login First");
		}
		return "loginForm";
		
	}
	
	
	@GetMapping("/delete")
	public String deleteform(int id,ModelMap map,@SessionAttribute(name="emp", required=false) EmployeeBean employeebean) {
		if(employeebean!=null) {
			boolean deletedata= service.deleteEmpData(id);
			 if(!deletedata) {
				 map.addAttribute("msg", "Data deleted successfully" );
				 
			 }else {
				 map.addAttribute("msg",  "Data not found for" + id);
			 }
			 return "deleteForm";
			
		}else {
			map.addAttribute("errMsg","pls login first");
			return "loginForm";
			
		}// end of getDelete form
		
		
		
	}//end of Controller
	
	@GetMapping("/alldata")
	public String getAllEmpData(ModelMap map,
			@SessionAttribute(name = "emp", required = false) EmployeeBean employeeBean) {
		if (employeeBean != null) {
			List<EmployeeBean> data = service.getAllEmp();
			if (data != null) {
				map.addAttribute("data", data);
			} else {
				map.addAttribute("errmsg", "Empty Table");
			}
			return "getall";
		} else {
			map.addAttribute("errmsg", "please login first");
			return "login";
		}

	}// End of getAllEmpData Method
	
	@GetMapping("/logout")
	public String logout(HttpSession session,ModelMap map) {
		session.invalidate();
		map.addAttribute("msg", "Log Out Successful");
		return "loginForm";
		
	}
	
	@GetMapping("/search")
	public String searchEmp(int id,ModelMap map,@SessionAttribute(name="emp", required=false) EmployeeBean employeebean) {
		if(employeebean!=null) {
			 EmployeeBean employeebean2=service.getEmployee(id);
			 if(employeebean2!=null) {
				 map.addAttribute("data",  employeebean2);
				 
			 }else {
				 map.addAttribute("errMsg",  "Data not found for" +id);
			 }
			 return "searchForm";
			
		}else {
			map.addAttribute("errMsg","pls login first");
			return "loginForm";
			
		}// end of getSearch form
		
	}//end of Controller
	
//	@GetMapping("/update")
//	public String getUpdate(ModelMap map,@SessionAttribute(name="emp", required=false) EmployeeBean bean) {
//		if(bean!=null) {
//			return "addEmployees";
//			
//		}else {
//			map.addAttribute("errMsg","pls login first");
//			return "loginForm";
//			
//		}
//		
//	}
	
	
	
	@PostMapping("/loginform")
	public String getAuthenticate(int id,String pwd,HttpServletRequest request,ModelMap map) {
		EmployeeBean employeebean = service.authenticate(id, pwd);
		
		if(employeebean!=null) {
			HttpSession session=request.getSession(true);
			session.setAttribute("emp", employeebean);
			return "homePage";
			
			
		}
		
		else {
			map.addAttribute("errMsg","Invalid Credentials");
			return "loginForm";
		}
		
	}

}
