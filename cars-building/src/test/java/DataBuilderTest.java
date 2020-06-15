import org.example.carfactory.building.builder.DataBuilder;
import org.example.carfactory.data.service.CarService;
import org.junit.Assert;
import org.junit.Test;


public class DataBuilderTest {
    @Test
    public void buildDataListTest() {
        DataBuilder dataBuilder = new DataBuilder();
        CarService carService = dataBuilder.getCarService();
        dataBuilder.buildDataList();

        Assert.assertTrue(carService.findAll().size() == 11);
    }


}
