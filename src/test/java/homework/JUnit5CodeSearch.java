package homework;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class JUnit5CodeSearch {
    @Test
    void shouldFindJUnit5CodeSearchOnThePageSoftAssertions() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".wiki-pages-box .wiki-more-pages-link button").click();
        $(byText("SoftAssertions")).click();
        $("#user-content-3-using-junit5-extend-test-class").ancestor("h4").shouldHave(Condition.text("Using JUnit5 extend test class:"));
    }
}
