package scheduleshare.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import scheduleshare.domain.model.Schedule;
import scheduleshare.domain.service.CommunityService;

@Controller
public class HelloController {
	@Autowired
	CommunityService communityService;

	@RequestMapping(value = "/")
	public String index(Model model) {
		List<Schedule> schedules = communityService.getGroupSchedule(1);
		model.addAttribute("schedules", schedules);

		return "/index";
	}
}
