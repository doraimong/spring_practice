package com.example.hancoding.controller;

import com.example.hancoding.entity.Board;
import com.example.hancoding.repository.BoardRepository;
import com.example.hancoding.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("board/write")
    public String boardWriteForm(){

        return "boardwrite";//template(view)
    }

    @PostMapping("/board/writepro")
    public String boardWritePro(Board board){

        System.out.println(board);
        boardService.write(board);

        return "";
    }

    @GetMapping("/board/list")
    public String boardList(Model model){

        model.addAttribute("list", boardService.boardList());

        return "boardlist";
    }

    @GetMapping("/board/view")//localhost:8080/board/view?id=1
    public String boardView(Model model, Integer id){

        model.addAttribute("board", boardService.boardView(id));
        return "boardview";//template(view)
    }
}
