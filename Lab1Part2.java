import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class Lab1Part2 {
	
	/* This program receives two dates from the user and calculates the number of days  between them.
	 * 
	 * In instances where the second date entered is after the first date, the duration is displayed
	 * with positive numbers.
	 * 
	 * In instances where the second date entered precedes the first, the duration is
	 * displayed with negative numbers.
	*/

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		LocalDate now = LocalDate.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		
		// Get values for first and second date, then get period between
		
		LocalDate firstDate = getLocalDateFromInput("Enter a date in d/mm/yyyy format: ");

		LocalDate secondDate = getLocalDateFromInput("Enter a second date in d/mm/yyyy format: ");
		
		Period period = Period.between(firstDate, secondDate);
		System.out.println("The period between the two dates consists of: " + period.getYears() + " years, " + period.getMonths() + " months, " + "and " + period.getDays() + " days.");
		
		
		
	}
	
	public static LocalDate getLocalDateFromInput(String prompt) {
		
		// Make sure the date received is valid; prompt user to enter another date if not valid
		Scanner scnr = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		LocalDate localDate = null;
		while (localDate == null) {
			System.out.println(prompt);
			String input = scnr.next();
			try { // contain the explosion
				localDate = LocalDate.parse(input, formatter);
			} catch (DateTimeParseException exception) {
				continue;
			}
		}
		return localDate;
	}

	
	public static String formatPeriod(Period period) {
		
		int years = (period.getYears());
		int months = (period.getMonths());
		int days = (period.getDays());
			
	
		
		
		
		return "";
	}
}
