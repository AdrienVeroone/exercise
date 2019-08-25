package veroone.org.exercise;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(BasicController.BASE_PATH)
@RestController
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class BasicController {

  static final String BASE_PATH = "/result";
  private final FizzBuzzService fizzBuzzService;

  @GetMapping
  public String getResult(@NotNull @RequestParam int source) {
    return fizzBuzzService.findFizzBuzzResult(source);
  }
}
