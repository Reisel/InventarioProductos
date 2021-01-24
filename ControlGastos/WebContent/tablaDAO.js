$("#enviar").on('click',enviar);

function enviar(){
//Se crea el objeto item
//var item = {fecha, codigo, lugar, categoria, marca, nombre, und, cant, precio, total};

alert("hola")
$( "tr" ).each(function( index ) {
    if(index!==0) {
        $( "td" ).each(function( index ){
            console.log( index + ": " + $( this ).text() );
        })
    }



        
});


}
var myRows = [];
var $headers = $("th");
var $rows = $("tbody tr").each(function(index) {
     $cells = $(this).find("td");
     myRows[index] = {};
     $cells.each(function(cellIndex) {
       myRows[index][$($headers[cellIndex]).html()] = $(this).html();
     });    
});