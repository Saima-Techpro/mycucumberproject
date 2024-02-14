package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;
import java.sql.SQLException;
import java.util.List;
public class DBStepDefs {
    @Given("user connects to the application database")
    public void user_connects_to_the_application_database() {
        DBUtils.createConnection();
    }
    @And("user gets the column {string} from the table {string}")
    public void userGetsTheColumnFromTheTable(String columnName, String tableName) {
//        DBUtils.executeQuery( "select * from jhi_user" ); hard coded
        DBUtils.executeQuery( "select "+columnName+" from "+tableName+"" );

    }
    @And("read all the column {string} data")
    public void readAllTheColumnData(String columnName) throws SQLException {
//        go the next row
        DBUtils.getResultset().next();
//        getting the data
        Object object1 = DBUtils.getResultset().getObject(columnName);
        System.out.println(object1);
//        --------------------------
        DBUtils.getResultset().next();
        Object object2 = DBUtils.getResultset().getObject(columnName);
        System.out.println(object2);
//        --------------------------
        DBUtils.getResultset().next();
        Object object3 = DBUtils.getResultset().getObject(columnName);
        System.out.println(object3);
//        --------------------------
//        Going to a specific row
        DBUtils.getResultset().absolute(4);//going to the 4th row
        Object object4 = DBUtils.getResultset().getObject(columnName);
        System.out.println(object4);
//        ---------------------------
//        Using while loop

        int rowNum = 5;
        while (DBUtils.getResultset().next()){
            Object currentRowData = DBUtils.getResultset().getObject(columnName);
            System.out.println(rowNum +" : "+ currentRowData);
            rowNum++;
        }
        System.out.println("There are "+rowNum +" data in "+columnName + " column");
    }
    @Then("verify table {string} and column {string} contains data {string}")
    public void verify_table_and_column_contains_data(String tableName, String columnName, String dataName) {
//        get the column names
//        store in a list
        List<Object> allColumnData = DBUtils.getColumnData("select "+columnName+" from "+tableName+"",columnName);
        System.out.println("Column Data: "+allColumnData);
//        assert if that list contains the given data
        Assert.assertTrue(allColumnData.contains(dataName));
    }

    @Then("close the connection")
    public void closeTheConnection() {
        DBUtils.closeConnection();
    }
}