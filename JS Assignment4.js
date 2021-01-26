1.


2.

3.var str = "Is this all there is?";
var patt1 = /[^h]/g;

4.var listItems = $( 'li' );
var rawListItem = listItems[1]; // or listItems.get(0)
var html = rawListItem.innerHTML;
console.log(html);


5.$("a").attr("href", "www.w3resource.com/mysql/mysql-tutorials.php");

$("a").text("MySQL Tutorial");

6. $(document).ready(function() { 
                    $("div").click(function() { 
                        $("div").dblclick(); 
                    }); 

7.$("h1,h2,h3" ).click(function() {
  $( this ).slideUp();
});
