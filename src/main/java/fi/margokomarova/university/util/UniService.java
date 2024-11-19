package fi.margokomarova.university.util;

import fi.margokomarova.university.entity.General;
import fi.margokomarova.university.entity.Studying;
import fi.margokomarova.university.entity.Teaching;

public class UniService {
    public void makeTeach (Teaching teaching){
        teaching.present();
        teaching.checkHomework();
    }

    public void makeStudy(Studying studying){
        studying.visitLecture();
        studying.doHomework();
    }

    public void makeGeneral (General general){
        general.eat();
        general.sleep();
        general.travel();
    }




}
