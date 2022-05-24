package com.interview.interview;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Cart {
    private List<Item> items;
    private int total;
}
