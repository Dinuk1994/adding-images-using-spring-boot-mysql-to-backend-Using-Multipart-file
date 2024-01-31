package org.example.service.impl;

import org.example.dto.Image;
import org.example.entity.ImageEntity;
import org.example.repository.ImageRepository;
import org.example.service.ImageService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageRepository imageRepository;

    ModelMapper modelMapper;

    @Bean
    public void setup(){
        this.modelMapper=new ModelMapper();
    }

    public void save(Image image){
        ImageEntity entity = modelMapper.map(image, ImageEntity.class);
        imageRepository.save(entity);
    }
}
