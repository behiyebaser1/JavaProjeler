package com.behiye.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.behiye.domain.Kurs;
import com.behiye.domain.Ogretmen;
import com.behiye.service.KursServisi;

@Controller
@RequestMapping("/kurs")
public class KursController {

	@Autowired
	KursServisi kursServisi;// daodan aldýk

	@GetMapping("/list")
	public String listKurs(Model model, HttpSession oturum) {

		String isimKontrol = (String) oturum.getAttribute("oturum");
		if (isimKontrol == null) {
			return "redirect:/user/login";
		} else {

			List<Kurs> kursList = kursServisi.getKurslar();

			model.addAttribute("kurslar", kursList);

			return "kurs-list";
		}

	}

	@GetMapping("/kurs-ekle")
	public String kursEkle(Model model, HttpSession oturum) {

		String isimKontrol = (String) oturum.getAttribute("oturum");
		if (isimKontrol == null) {
			return "redirect:/user/login";
		}

		Kurs kurs = new Kurs();
		model.addAttribute("kurs", kurs);

		return "kurs-form";

	}

	@GetMapping("/anasayfa")
	public String anasayfa(Model model, HttpSession oturum) {

		return "welcome";

	}

	@PostMapping("/kurs-kaydet")
	public String kursKaydet(@ModelAttribute("kurs") Kurs kurs) {

		kursServisi.saveKurs(kurs);
		return "redirect:/kurs/list";
	}

	@GetMapping("/kurs-guncelle")
	public String ogrenciGuncelle(@RequestParam("kursId") int kursId, Model model) {

		Kurs kurs = kursServisi.getKurs(kursId);
		model.addAttribute("kurs", kurs);

		return "kurs-form";

	}

	@GetMapping("/kurs-sil")
	public String kursSil(@RequestParam("kursId") int kursId) {// geçiþ söz konusu deðil modeli sildik

		kursServisi.deleteKurs(kursId);

		return "redirect:/kurs/list";

	}

	@ModelAttribute("ögretmenler")
	public Map<Integer, String> getJobs() {
		Map<Integer, String> ogr = new HashMap<Integer, String>();

		List<Ogretmen> ogrList = kursServisi.getOgrList();
		for (Ogretmen o : ogrList) {

			ogr.put(o.getOgretmenId(), o.getFirstName());

		}
		return ogr;

	}

}
