package xom.xworkz.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import xom.xworkz.sb.entity.Employee;
import xom.xworkz.sb.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService emplService;

	@GetMapping("/")
	public String viewHomePage(Model model) {

		model.addAttribute("listEmployees", emplService.getAllEmployees());

		return "index";
	}

	@GetMapping("/showNewEmployeeForm")
	public String viewhomePage(Model model) {

		Employee employee  = new Employee();

		model.addAttribute("employee", employee);

		return "new_employee";
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {

		emplService.saveEmployee(employee);
		return "redirect:/";
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

		Employee employee  = emplService.getEmployeeById(id);

		model.addAttribute("employee", employee );
		return "update_employee";
	}

	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable(value = "id") long id) {

		this.emplService.deleteEmployeeId(id);

		return "redirect:/";
	}

}
