package carmelo.spring.service;

import java.util.Arrays;
import java.util.List;
import carmelo.spring.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public List<Customer> findAll() {
        return Arrays.asList(
                new Customer(0, "Laura", "Steel", "429 Seventh Av.", "Dallas"),
                new Customer(1, "Susanne", "King", "366 - 20th Ave.", "Olten"),
                new Customer(2, "Anne", "Miller", "20 Upland Pl.", "Lyon"),
                new Customer(3, "Michael", "Clancy", "542 Upland Pl.", "San Francisco"),
                new Customer(4, "Sylvia", "Ringer", "365 College Av.", "Dallas"),
                new Customer(5, "Laura", "Miller", "294 Seventh Av.", "Paris"),
                new Customer(6, "Laura", "White", "506 Upland Pl.", "Palo Alto"),
                new Customer(7, "James", "Peterson", "231 Upland Pl.", "San Francisco"),
                new Customer(8, "Andrew", "Miller", "288 - 20th Ave.", "Seattle"),
                new Customer(9, "James", "Schneider", "277 Seventh Av.", "Berne"),
                new Customer(10, "Anne", "Fuller", "135 Upland Pl.", "Dallas"),
                new Customer(11, "Julia", "White", "412 Upland Pl.", "Chicago"),
                new Customer(12, "George", "Ott", "381 Upland Pl.", "Palo Alto"),
                new Customer(13, "Laura", "Ringer", "38 College Av.", "New York"),
                new Customer(14, "Bill", "Karsen", "53 College Av.", "Oslo"),
                new Customer(15, "Bill", "Clancy", "319 Upland Pl.", "Seattle"),
                new Customer(16, "John", "Fuller", "195 Seventh Av.", "New York"),
                new Customer(17, "Laura", "Ott", "443 Seventh Av.", "Lyon"),
                new Customer(18, "Sylvia", "Fuller", "158 - 20th Ave.", "Paris"),
                new Customer(19, "Susanne", "Heiniger", "86 - 20th Ave.", "Dallas"),
                new Customer(20, "Janet", "Schneider", "309 - 20th Ave.", "Oslo"),
                new Customer(21, "Julia", "Clancy", "18 Seventh Av.", "Seattle"),
                new Customer(22, "Bill", "Ott", "250 - 20th Ave.", "Berne"),
                new Customer(23, "Julia", "Heiniger", "358 College Av.", "Boston"),
                new Customer(24, "James", "Sommer", "333 Upland Pl.", "Olten"),
                new Customer(25, "Sylvia", "Steel", "269 College Av.", "Paris"),
                new Customer(26, "James", "Clancy", "195 Upland Pl.", "Oslo"),
                new Customer(27, "Bob", "Sommer", "509 College Av.", "Seattle"),
                new Customer(28, "Susanne", "White", "74 - 20th Ave.", "Lyon"),
                new Customer(29, "Andrew", "Smith", "254 College Av.", "New York"),
                new Customer(30, "Bill", "Sommer", "362 - 20th Ave.", "Olten"),
                new Customer(31, "Bob", "Ringer", "371 College Av.", "Olten"),
                new Customer(32, "Michael", "Ott", "339 College Av.", "Boston"),
                new Customer(33, "Mary", "King", "491 College Av.", "Oslo"),
                new Customer(34, "Julia", "May", "33 Upland Pl.", "Seattle"),
                new Customer(35, "George", "Karsen", "412 College Av.", "Chicago"),
                new Customer(36, "John", "Steel", "276 Upland Pl.", "Dallas"),
                new Customer(37, "Michael", "Clancy", "19 Seventh Av.", "Dallas"),
                new Customer(38, "Andrew", "Heiniger", "347 College Av.", "Lyon"),
                new Customer(39, "Mary", "Karsen", "202 College Av.", "Chicago"),
                new Customer(40, "Susanne", "Miller", "440 - 20th Ave.", "Dallas"),
                new Customer(41, "Bill", "King", "546 College Av.", "New York"),
                new Customer(42, "Robert", "Ott", "503 Seventh Av.", "Oslo"),
                new Customer(43, "Susanne", "Smith", "2 Upland Pl.", "Dallas"),
                new Customer(44, "Sylvia", "Ott", "361 College Av.", "New York"),
                new Customer(45, "Janet", "May", "396 Seventh Av.", "Oslo"),
                new Customer(46, "Andrew", "May", "172 Seventh Av.", "New York"),
                new Customer(47, "Janet", "Fuller", "445 Upland Pl.", "Dallas"),
                new Customer(48, "Robert", "White", "549 Seventh Av.", "San Francisco"),
                new Customer(49, "George", "Fuller", "534 - 20th Ave.", "Olten")
        );
    }

}
