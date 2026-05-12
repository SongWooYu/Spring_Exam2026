package kr.pile.dy.exam2026.controller;

import kr.pile.dy.exam2026.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/chp07")
public class Chap07_01Controller {
    @GetMapping("/form")
    public String RequestForm(){
        return "viewFilePage";
    }

    @PostMapping("/form")
    public String RequestFileUploadResult(@ModelAttribute Member member, Model model) throws IOException {
//    public String RequestFileUploadResult(MultipartHttpServletRequest request, Model model) throws IOException {
//    public String RequestFileUploadResult(@RequestParam("name")String name, @RequestParam("fileImage")MultipartFile file, Model model) throws IOException {
        String name = member.getName();
        MultipartFile file = member.getFileImage();
        String originFileName = file.getOriginalFilename();
        File saveFile = new File("d:\\upload\\" + name + "_" + originFileName);

        try {
            file.transferTo(saveFile);
            model.addAttribute("title", "파일업로드 결과 페이지");
            model.addAttribute("originFileName", originFileName);
            model.addAttribute("saveFileName", saveFile.getName());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "viewFilePageResult";
    }

//    @PostMapping("/form")
//    public String RequestFileUploadResult(@RequestParam("name")String name, @RequestParam("fileImage")MultipartFile file, Model model) throws IOException {
////    public String RequestFileUploadResult(MultipartHttpServletRequest request, Model model) throws IOException {
//
//        String originFileName = file.getOriginalFilename();
//        File saveFile = new File("d:\\upload\\" + name + "_" + originFileName);
//
//        try {
//            file.transferTo(saveFile);
//            model.addAttribute("title", "파일업로드 결과 페이지");
//            model.addAttribute("originFileName", originFileName);
//            model.addAttribute("saveFileName", saveFile.getName());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return "viewFilePageResult";
//    }

}
