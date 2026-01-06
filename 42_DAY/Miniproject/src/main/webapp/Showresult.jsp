<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Calculator</title>

<style>
*{
    box-sizing:border-box;
    font-family: 'Segoe UI', sans-serif;
}

body{
    margin:0;
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background: linear-gradient(135deg,#020617,#020617);
}

/* Calculator */
.calculator{
    width:400px;
    background:#0b1220;
    padding:25px;
    border-radius:22px;
    box-shadow: 0 30px 70px rgba(0,0,0,0.9);
}

/* Display */
.display{
    width:100%;
    height:80px;
    background:#020617;
    border:none;
    border-radius:18px;
    color:#38bdf8;
    font-size:30px;
    text-align:right;
    padding:18px;
    margin-bottom:20px;
    box-shadow: inset 0 0 18px rgba(56,189,248,0.25);
}

/* Grid */
.keys{
    display:grid;
    grid-template-columns: repeat(4,1fr);
    gap:14px;
}

/* Buttons */
button{
    height:62px;
    border:none;
    border-radius:18px;
    font-size:20px;
    cursor:pointer;
    background:#111827;
    color:#e5e7eb;
    transition: all 0.15s ease;
}

button:hover{
    background:#1f2937;
    transform: translateY(-2px);
}

/* Operators */
.op{
    background:#1e40af;
}
.op:hover{
    background:#1d4ed8;
}

/* Equal */
.equal{
    grid-column: span 2;
    background:#22c55e;
    color:#022c22;
}
.equal:hover{
    background:#16a34a;
}

/* Clear */
.clear{
    background:#dc2626;
}
.clear:hover{
    background:#b91c1c;
}

/* Result text */
.result{
    text-align:right;
    margin-top:15px;
    font-size:20px;
    color:#a5f3fc;
}
</style>
</head>

<body>

<form class="calculator" action="Mycalculator" method="get">

    <!-- Inputs -->
    <input class="display" type="text" name="value1" placeholder="First number">
    <input class="display" type="text" name="value2" placeholder="Second number">

    <!-- Buttons -->
    <div class="keys">
        <button class="op" name="button" value="plus">+</button>
        <button class="op" name="button" value="min">−</button>
        <button class="op" name="button" value="multi">×</button>
        <button class="op" name="button" value="div">÷</button>

        <button type="reset" class="clear">C</button>
        <button class="equal" name="button" value="plus">=</button>
    </div>

    <!-- Result -->
    <%
        Object res = request.getAttribute("result");
        if(res != null){
    %>
        <div class="result">Result : <%= res %></div>
    <%
        }
    %>

</form>

</body>
</html>
