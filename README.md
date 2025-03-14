<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Adicionar Cliente Detalhe</title>
</head>
<body>
    <h2>Adicionar Detalhes do Cliente</h2>
    <form th:action="@{/clientes-detalhes/salvar}" method="post" th:object="${clienteDetalhe}">
        <label for="cliente">Selecionar Cliente:</label>
        <select id="cliente" required onchange="atualizarIdCliente()">
            <option value="" disabled selected>Selecione um cliente</option>
            <option th:each="cliente : ${clientes}" 
                    th:value="${cliente.id}" 
                    th:text="${cliente.nome}">
            </option>
        </select>

        <br><br>

        <label for="idCliente">ID do Cliente:</label>
        <input type="text" id="idCliente" name="idCliente" th:field="*{idCliente}" readonly />

        <br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" th:field="*{email}" required />

        <br><br>

        <label for="endereco">Endereço:</label>
        <input type="text" id="endereco" name="endereco" th:field="*{endereco}" required />

        <br><br>

        <button type="submit">Salvar</button>
    </form>

    <script>
        function atualizarIdCliente() {
            let select = document.getElementById("cliente");
            let idClienteInput = document.getElementById("idCliente");
            idClienteInput.value = select.value;
        }
    </script>
</body>
</html>
