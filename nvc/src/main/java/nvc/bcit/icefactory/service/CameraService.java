package nvc.bcit.icefactory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.bcit.icefactory.model.Camera;
import nvc.bcit.icefactory.repository.CameraRepository;

@Service
public class CameraService {

    @Autowired
    private CameraRepository cameraRepository;

    public List<Camera> getCameras(){
        return cameraRepository.findAll();
    }
    
    public 

}
