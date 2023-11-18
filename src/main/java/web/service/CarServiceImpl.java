package web.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService{
    private final List<Car> cars = Arrays.asList(
        new Car("Nissan", "1", 4),
        new Car("FaX", "F", 5),
        new Car("Lada", "Vesta", 3),
        new Car("X-Trail", "777", 4),
        new Car("BMV", "XS", 5)
    );

    @Override
    public List<Car> getAllCars(int count) {
        if (count < 1 || count > cars.size()) {
            count = cars.size();
        }
        return cars.subList(0, count);
    }
}
