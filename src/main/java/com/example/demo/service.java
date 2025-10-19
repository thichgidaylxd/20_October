package com.example.demo;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class service {

    repo repoo;
    public entity create(entity request){
        entity en = entity.builder()
                .noiDung(request.getNoiDung())
                .tenNguoiGui(request.getTenNguoiGui())
                .tenNguoiNhan(request.getTenNguoiNhan())
                .build();

        return repoo.save(en);
    }

    public entity getById(Integer id){
        return repoo.findById(id).orElse(null);
    }
}
