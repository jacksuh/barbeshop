function validarCampos() {
			if(document.getElementById("profissional").value == 'Select...') {
				alert("Selecione um profissional!");
				return false;
			}else if(document.getElementById("nome").value == '') {
				alert("Informe a Nome!");
				return false;
			}else if(document.getElementById("sobrenome").value == '') {
				alert("Informe a Sobrenome!");
				return false;
			}else if(document.getElementById("endereco").value == '') {
				alert("Informe a Endereco!");
				return false;
			}else if(document.getElementById("bairro").value == '') {
				alert("Informe a Bairro!");
				return false;
			}else if(document.getElementById("cidade").value == '') {
				alert("Informe a Cidade!");
				return false;
			}else if(document.getElementById("cep").value == '') {
				alert("Informe a Cep!");
				return false;
			}else if(document.getElementById("data").value == '') {
				alert("Informe a Data!");
				return false;
			}else if(document.getElementById("hora").value == '') {
				alert("Informe a Hora!");
				return false;
			}
			
			return true;
		}
