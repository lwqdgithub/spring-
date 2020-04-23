package com.lwq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lwq
 * @date 2020/4/20 -17:00
 */
//对应的无参 有参 tostring
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
