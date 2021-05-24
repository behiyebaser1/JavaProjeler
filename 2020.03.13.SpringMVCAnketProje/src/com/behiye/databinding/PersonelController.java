package com.behiye.databinding;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/personel")
public class PersonelController {

	@Autowired
	private ApplicationContext appContext;

	// @Autowired
	private Personel personel;

	@RequestMapping("/showform")
	public String showPersonel(Model model) {

		personel = appContext.getBean("personel", Personel.class);

		// Personel p = new Personel();
		model.addAttribute("personel", personel);

		return "personel-form";
	}

	@RequestMapping("/saveform")
	public String savePersonel(@Valid @ModelAttribute("personel") Personel anketSayfa1, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "personel-form";
		}
		personel.setAd(anketSayfa1.getAd());
		personel.setSoyad(anketSayfa1.getSoyad());
		personel.setCinsiyet(anketSayfa1.getCinsiyet());
		personel.setEmail(anketSayfa1.getEmail());
		personel.setAdres(anketSayfa1.getAdres());
		personel.setEhliyet(anketSayfa1.getEhliyet());

		return "personel-form2";
	}

	/*
	 * @RequestMapping("/saveform2") public String savePersonel(Model
	 * model, @ModelAttribute("personel-form2") Personel anketSayfa2) {
	 * 
	 * model.addAttribute("personel-form", personel);
	 * model.addAttribute("personel-form2", anketSayfa2);
	 * 
	 * return "personel-confirm"; }
	 */

	@RequestMapping("/saveform2")
	public String sayfa3(HttpServletRequest request, Model model) {

		personel.setTarih(request.getParameter("tarih"));
		personel.setYabanciDil(request.getParameterValues("yabanciDil"));
		personel.setDuzey(request.getParameter("duzey"));
		personel.setOkul(request.getParameter("okul"));
		personel.setPozisyon(request.getParameter("pozisyon"));

		model.addAttribute("personel", personel);

		return "personel-confirm";
	}

}
