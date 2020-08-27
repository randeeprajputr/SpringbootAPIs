package org.example.kaarva.friends;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Friends {
    @RequestMapping("/friends")
    public List<Friends_List> getAllFriends(){
            return Arrays.asList(
                    new Friends_List("Randeep",21),
                    new Friends_List("Vijay Rana",22),
                    new Friends_List("Jeetendra Rawat",24)
            );
    }
}
