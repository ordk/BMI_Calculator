package pl.bmicalculator.service;

import pl.bmicalculator.model.Bmi;

import java.util.List;

public interface IBmiService {
    List<Bmi> getAllBmis();
    Bmi save(Bmi bmi);
    double calculateAverageBmi();

    Bmi getBmiById(int id);
}
