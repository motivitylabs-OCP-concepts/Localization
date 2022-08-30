import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // using the getDefault function of the Locale class
        Locale locale = Locale.getDefault( ) ;
// using the getDisplayCountry( ) function to display locale's country appropriate for user
        System.out.println( locale.getDisplayCountry( ) ) ;
// using the getDisplayLanguage( ) function to display locale's language appropriate for user
        System.out.println( locale.getDisplayLanguage( ) ) ;
// using the getDisplayName( ) function to display locale that is appropriate for user
        System.out.println( locale.getDisplayName( ) ) ;
// using the getISO3Country( ) function to display the three-letter abbreviation for the lacale's country
        System.out.println( locale.getISO3Country( ) ) ;
// using the getISO3Language( ) function to display the three-letter abbreviation for the locale's language
        System.out.println( locale.getISO3Language( ) ) ;
// using the getLanguage( ) function to display the two-letter abbreviation for the Locale's language
        System.out.println( locale.getLanguage( ) ) ;
// using the getCountry( ) function to display the locale's country code which is an uppercase ISO 2-letter code
        System.out.println( locale.getCountry( ) ) ;
// using the getDisplayVariant( ) function to display the locale's variant code appropriate for the user
        System.out.println( locale.getDisplayVariant( ) ) ;
    }
}
    