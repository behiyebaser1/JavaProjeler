package com.behiye.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.behiye.domain.Ogrenci;
import com.behiye.service.OgrenciServisi;

@Controller
@RequestMapping("/ogrenci")
public class OgrenciController {

	@Autowired
	OgrenciServisi ogrenciServisi;// daodan aldýk

	@GetMapping("/list") // sayfa geçiþleri için kullanýlýr.

	public String listOgrenci(Model model, HttpSession oturum) {

		String isimKontrol = (String) oturum.getAttribute("oturum");
		if (isimKontrol == null) {
			return "redirect:/user/login";
		} else {

			List<Ogrenci> ogrList = ogrenciServisi.getOgrenciler();

			model.addAttribute("ogrenciler", ogrList);

			return "ogrenci-list";
		}

	}

	@GetMapping("/ogrenci-ekle")
	public String ogrenciEkle(Model model, HttpSession oturum) {

		String isimKontrol = (String) oturum.getAttribute("oturum");
		if (isimKontrol == null) {
			return "redirect:/user/login";
		}

		Ogrenci ogr = new Ogrenci();
		model.addAttribute("ogrenci", ogr);

		return "ogrenci-form";

	}

	@PostMapping("/ogrenci-kaydet")
	public String ogrenciKaydet(@ModelAttribute("ogrenci") Ogrenci ogr) {

		ogrenciServisi.saveOgrenci(ogr);
		return "redirect:/ogrenci/list";// kodu tekrarlattýk****
	}

	@GetMapping("/anasayfa")
	public String anasayfa(Model model, HttpSession oturum) {

		return "welcome";

	}

	@GetMapping("/ogrenci-guncelle")
	public String ogrenciGuncelle(@RequestParam("ogrenciId") int ogrId, Model model) {

		Ogrenci ogr = ogrenciServisi.getOgrenci(ogrId);
		model.addAttribute("ogrenci", ogr);

		return "ogrenci-form";

	}

	@GetMapping("/ogrenci-sil")
	public String ogrenciSil(@RequestParam("ogrenciId") int ogrId) {// geçiþ söz konusu deðil modeli sildik

		ogrenciServisi.deleteOgrenci(ogrId);

		return "redirect:/ogrenci/list";

	}

}
