$(document).on('ready', funcMain());

function funcMain()
{   
	$("#add_row").on('click',newRowTable);  //En elaboracion

	$("loans_table").on('click','.fa-eraser',deleteProduct); //Pendiente
	$("loans_table").on('click','.fa-edit',editProduct); //Pendiente

	$("body").on('click',".fa-eraser",deleteProduct); //Pendiente
	$("body").on('click',".fa-edit",editProduct); //Pendiente
}

function newRowTable()
{
	var fecha=document.getElementById("fecha").value;
	var codigo=document.getElementById("codigo").value;
	var lugar=document.getElementById("lugar").value;
    var categoria=document.getElementById("categoria").value;
    var marca=document.getElementById("marca").value;
    var nombre=document.getElementById("nombre").value;
    var und=document.getElementById("und").value;
    var cant=number_format((document.getElementById("cant").value),1);
    var precio=number_format((document.getElementById("precio").value),1);
    var total=number_format((parseFloat(cant)*parseFloat(precio)),1);

	var name_table=document.getElementById("tabla");

    var row = name_table.insertRow(-1);
    var cell1 = row.insertCell(0);
    var cell2 = row.insertCell(1);
    var cell3 = row.insertCell(2);
    var cell4 = row.insertCell(3);
    var cell5 = row.insertCell(4);
    var cell6 = row.insertCell(5);
    var cell7 = row.insertCell(6);
    var cell8 = row.insertCell(7);
    var cell9 = row.insertCell(8);
    var cell10 = row.insertCell(9);
    var cell11 = row.insertCell(10);

    cell1.innerHTML = '<p name="numero_f[]" class="non-margin">'+fecha+'</p>';
    cell2.innerHTML = '<p name="codigo_p[]" class="non-margin">'+codigo+'</p>';
    cell3.innerHTML = '<p name="descuento_p[]" class="non-margin">'+lugar+'</p>';
    cell4.innerHTML = '<p name="cantidad_p[]" class="non-margin">'+categoria+'</p>';
    cell5.innerHTML = '<p name="precio_p[]" class="non-margin">'+marca+'</p>';
    cell6.innerHTML = '<p name="subtotal_p[]" class="non-margin">'+nombre+'</p>';
    cell7.innerHTML = '<p name="impuesto_p[]" class="non-margin">'+und+'</p>';
    cell8.innerHTML = '<p name="total_p[]" class="non-margin">'+cant+'</p>';
    cell9.innerHTML = '<p name="total_p[]" class="non-margin">'+precio+'</p>';
    cell10.innerHTML = '<p name="total_p[]" class="non-margin">'+total+'</p>';
    cell11.innerHTML = '<button><ion-icon name="pencil-outline" size="small"></ion-icon></button>' +
                        '<button><ion-icon name="trash-outline" size="small"></ion-icon></button>';

    //Para calcular los totales enviando los parametros
    calculateTotal((fomatear_Numero(total)), 1);
    //Para calcular los totales sin enviar los parametros, solo adquiriendo los datos de la columna con mismo tipo de datos
    //calculateTotalsBySumColumn()
}

function calculateTotal(total, accion){
    
    var total_total = document.getElementById("total-total").innerHTML;
    var entrada =  fomatear_Numero(total_total);
	if (accion==1) {
        var total_suma = parseFloat(entrada) + parseFloat(total);
        var nun = number_format(total_suma, 2);
        document.getElementById("total-total").innerHTML= nun;        
	}else if(accion==2){
        var total_suma = parseFloat(entrada) - parseFloat(total);
        var nun = number_format(total_suma, 2);
        document.getElementById("total-total").innerHTML= nun; 
	}else{
		alert('Accion Invalida');
	}
}

function addCommas(nStr) {
    nStr += '';
    var x = nStr.split(',');
    var x1 = x[0];
    var x2 = x.length > 1 ? ',' + x[1] : '';
    var rgx = /(\d+)(\d{3})/;
    while (rgx.test(x1)) {
        x1 = x1.replace(rgx, '$1' + '.' + '$2');
    }
    return x1 + x2;
}

function number_format(amount, decimals) {

    amount += ''; // por si pasan un numero en vez de un string
    amount = parseFloat(amount.replace(/[^0-9\.]/g, '')); // elimino cualquier cosa que no sea numero o punto
    decimals = decimals || 0; // por si la variable no fue fue pasada

    // si no es un numero o es igual a cero retorno el mismo cero
    if (isNaN(amount) || amount === 0) 
        return parseFloat(0).toFixed(decimals);

    // si es mayor o menor que cero retorno el valor formateado como numero
    amount = '' + amount.toFixed(decimals);

    var amount_parts = amount.split('.'),
        regexp = /(\d+)(\d{3})/;

    while (regexp.test(amount_parts[0]))
        amount_parts[0] = amount_parts[0].replace(regexp, '$1' + '.' + '$2');

    return amount_parts.join(',');
}

function fomatear_Numero(amount) {

    amount += ''; // por si pasan un numero en vez de un string
    amount = amount.replace(/[^0-9\,]/g, '')
    amount = amount.replace(',', '.')
    amount = parseFloat(amount); // elimino cualquier cosa que no sea numero o punto

    return amount;
}
