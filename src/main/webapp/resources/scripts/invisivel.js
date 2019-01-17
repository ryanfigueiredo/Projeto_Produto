function invi_visi() {
		var telaDeCadastro = document.getElementById('cadastro');
	    var botaoSalvar = document.getElementById('btn_salvar');
	    var botaoEditar = document.getElementById('btn_editar');
	    if(botaoEditar.style.display === 'block'){
	    	botaoEditar.style.display = 'none'
		    }
	   	telaDeCadastro.style.display = 'block';
		botaoSalvar.style.display = 'block';
	}

	function invi_visi_1() {
	    var telaDeCadastro = document.getElementById('cadastro');
	    var botaoEditar = document.getElementById('btn_editar');
	    var botaoSalvar = document.getElementById('btn_salvar');
	    if(botaoSalvar.style.display === 'block'){
			botaoSalvar.style.display = 'none';
		    }
	    telaDeCadastro.style.display = 'block';
	    botaoEditar.style.display = 'block';
	}


	$(document).ready(function(e) {
		$('.fechar').click(function() {
			document.querySelector('.total').style.display = 'none';
		});

		

	});

	
	function invi_visi_tbl() {
	    var x = document.getElementById('tbl_prod');
	    if (x.style.display === 'none') {
	        x.style.display = 'block';
	    } else {
	        x.style.display = 'none';
	    }
	}
