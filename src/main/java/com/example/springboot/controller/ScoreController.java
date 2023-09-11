package com.example.springboot.controller;

import com.example.springboot.mapper.ScoreMapper;
import com.example.springboot.model.Score;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 功能：
 * 作者：俞凌志
 * 日期： ScoreController ScoreController
 */
@RestController
@CrossOrigin("*")
public class ScoreController {

    @Autowired
    ScoreMapper scoreMapper;

    private Gson gson=new Gson();

    @GetMapping("/score")

    public String getScoreList(){

        List<Score> scoreList=scoreMapper.selectList(null);
        return gson.toJson(scoreList);
    }
    @PostMapping("/addscore")
    public void AddScore(@RequestBody Score score){
        scoreMapper.insert(score);
    }
    @DeleteMapping("/deletescore")
    public void DeleteScore(@RequestBody Score score){
        scoreMapper.deleteById(score);

    }
    @PutMapping("/updatescore")
    public void UpdateScore(@RequestBody Score score){
        scoreMapper.updateById(score);
    }
}
