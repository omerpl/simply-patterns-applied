package com.example.demo.adapter;

import com.example.demo.factory.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping("rest/adapter")
public class AdapterController {
    private AdapterService adapterService;

    @Autowired
    AdapterController(AdapterService adapterService) {
        this.adapterService= adapterService;
    }
/*
example payload : {
  "foodInCals": [
    {
      "calorieValue": 100,
      "name": "apple"
    },
   {
      "calorieValue": 200,
      "name": "peach"
    }
  ],
  "foodInJoules": [
    {
      "jouleValue": 2450,
      "name": "Hamburger"
    }
  ]
}
*/
    @PostMapping("/regime")
    public String calculateWhatsEaten(@RequestBody RegimeDto regimeDto) {
        return this.adapterService.calculateWhatsEaten(regimeDto);
    }

}
