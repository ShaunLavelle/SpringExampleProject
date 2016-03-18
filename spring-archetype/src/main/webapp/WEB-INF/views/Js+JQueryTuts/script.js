/**
 * retrieves the element with id = "para". it listens for the click event on the element.
 * When the user clicks on the element with id equal to para... a function gets run.
 * The function retrieves the element by id again and calls hide().
 * So; when user clicks on this element.. it will become hidden.
 */

//$('#para').click(function() {
//	$('#para').hide();
//});

/**
 * When any image is clicked, all images are hidden
 */

//$('img').click(function() {
//	$('img').hide();
//});

/**
 * when the document is ready... element with id=para 
 * will fadeIn at a rate of 2000 milliseconds.
 */

//$(document).ready(function(){
//	$('#para').fadeIn(2000);
//});

/**
 * .load() means Once everything on the window is 
 * loaded. An alert will show.
 * Whereas .ready() waits until the DOM is ready. Pretty much as soon as the page opens. 
 */

//$(window).load(function() {
//	alert('The Window loaded');
//});
//
//$(document).ready(function() {
//	alert('The DOM is ready');
//})

/**
 * selects element with id of parent then finds all elements inside of this and then counts the length of elements and stored it in count variable. 
 */

//var count = $('#parent').find('*').length;
//alert(count);

/**
 * selects all elements with the type text. Colon means type.
 * listen for the focusin() event. focusin is when a user is inside of an input
 */

//$(':text').focusin(function(){
//	$(this).css('background','red');
//});

/**
 * selects all elements with the type text. Colon means type.
 * listen for the blur() event. blur is when a user is de-focuses out of an input
 */

//$(':text').blur(function(){
//	$(this).css('background','white');
//});

$('#username').keyup(function(){
	var username_value = $('#username').val();
	$('#username_feedback').html(username_value);
});











































