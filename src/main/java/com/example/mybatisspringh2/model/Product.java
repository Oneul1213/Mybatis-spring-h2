package com.example.mybatisspringh2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Product {
    private Long prodId;
    @NonNull private String prodName;
    @NonNull private Long prodPrice;
}
