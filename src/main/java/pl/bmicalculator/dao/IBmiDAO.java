package pl.bmicalculator.dao;

import pl.bmicalculator.model.Bmi;

import java.util.List;

public interface IBmiDAO {
    Bmi save(Bmi bmi);
    List<Bmi> getAllBmis();
    Bmi getBmiById(int id);
}
