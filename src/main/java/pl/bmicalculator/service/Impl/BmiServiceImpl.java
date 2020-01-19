package pl.bmicalculator.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.bmicalculator.dao.IBmiDAO;
import pl.bmicalculator.model.Bmi;
import pl.bmicalculator.service.IBmiService;

import java.util.List;

@Service
public class BmiServiceImpl implements IBmiService {

    @Autowired
    IBmiDAO bmiDAO;

    @Override
    public List<Bmi> getAllBmis() {
        return bmiDAO.getAllBmis();
    }

    @Override
    public Bmi save(Bmi bmi) {
        return bmiDAO.save(bmi);
    }

    @Override
    public double calculateAverageBmi() {
        List<Bmi> bmiList = this.bmiDAO.getAllBmis();
        double result = 0;
        for (Bmi bmi : bmiList) {
            result += bmi.getBmiValue();
        }

        result = ((double) Math.round((result/bmiList.size())*100)) / 100.0;
        return result;
    }

    @Override
    public Bmi getBmiById(int id) {
        return bmiDAO.getBmiById(id);
    }

}
