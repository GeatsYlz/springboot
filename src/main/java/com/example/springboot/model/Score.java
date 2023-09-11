package com.example.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 功能：
 * 作者：俞凌志
 * 日期： Score Score
 */
@Data
@AllArgsConstructor
public class Score {
    private  String sid;
    public  String cid;
    private double score;
}
