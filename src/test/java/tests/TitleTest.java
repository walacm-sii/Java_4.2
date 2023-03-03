package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.MainPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Execution(ExecutionMode.CONCURRENT)
public class TitleTest extends BaseTest {

    private MainPage mainPage;

    @BeforeEach
    void initializeInstances() {
        mainPage = new MainPage(driver);
    }

    @ParameterizedTest
    @DisplayName("Testing kotuszkowo.pl title")
    @Tag("regression")
    @Tag("kotuszkowo")
    @CsvSource({"http://kotuszkowo.pl/, Kotuszkowo- blog o kotach"})
    void shouldValidateCorrectTitleKotuszkowo(String url, String expectedTitle) {
        //GIVEN
        mainPage.goToPage(url);
        //WHEN
        String actualTitle = mainPage.getTitle();
        //THEN
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @DisplayName("Testing sii.pl title")
    @Tag("regression")
    @Tag("sii")
    @CsvSource(value = {"http://sii.pl/; Rozwiązania i usługi IT, inżynierii i BPO - Sii Polska"}, delimiter = ';')
    void shouldValidateCorrectTitleSii(String url, String expectedTitle) {
        //GIVEN
        mainPage.goToPage(url);
        //WHEN
        String actualTitle = mainPage.getTitle();
        //THEN
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @DisplayName("Testing onet.pl title")
    @Tag("regression")
    @Tag("onet")
    @CsvSource({"http://onet.pl/, Onet – Jesteś na bieżąco"})
    void shouldValidateCorrectTitleOnet(String url, String expectedTitle) {
        //GIVEN
        mainPage.goToPage(url);
        //WHEN
        String actualTitle = mainPage.getTitle();
        //THEN
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @DisplayName("Testing filmweb.pl title")
    @Tag("regression")
    @Tag("filmweb")
    @CsvSource({"http://filmweb.pl/, Filmweb - filmy takie jak Ty!"})
    void shouldValidateCorrectTitleFilmweb(String url, String expectedTitle) {
        //GIVEN
        mainPage.goToPage(url);
        //WHEN
        String actualTitle = mainPage.getTitle();
        //THEN
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @DisplayName("Testing selenium documentation title")
    @Tag("regression")
    @Tag("selenium")
    @CsvSource({"https://www.selenium.dev/documentation/en/webdriver/ , WebDriver | Selenium"})
    void shouldValidateCorrectTitleSelenium(String url, String expectedTitle) {
        //GIVEN
        mainPage.goToPage(url);
        //WHEN
        String actualTitle = mainPage.getTitle();
        //THEN
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }
}
