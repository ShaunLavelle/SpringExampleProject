/**
 * retrieves the element with id = "para". it listens for the click event on the element.
 * When the user clicks on the element with id equal to para... a function gets run.
 * The function retrieves the element by id again and calls hide().
 * So; when user clicks on this element.. it will become hidden.
 */

$('#para').click(function() {
	$('#para').hide();
})