from fastapi import FastAPI
from pydantic import BaseModel

app = FastAPI()


class CalculatorInput(BaseModel):
  num1: float
  num2: float


@app.get("/")
def read_root():
  return {"Hello": "TESTE"}


@app.post("/calculadora/soma")
def soma(input: CalculatorInput):
  return input.num1 + input.num2


@app.post("/calculadora/subtracao")
def subtracao(input: CalculatorInput):
  return input.num1 - input.num2


@app.post("/calculadora/divisao")
def divisao(input: CalculatorInput):
  if (input.num2 == 0):
    return "Não é possível dividir por zero"
  return input.num1 / input.num2


@app.post("/calculadora/multiplicacao")
def multiplicacao(input: CalculatorInput):
  return input.num1 * input.num2


@app.post("/calculadora/potencia")
def potencia(input: CalculatorInput):
  return input.num1**input.num2


@app.post("/calculadora/raiz")
def raiz(input: CalculatorInput):
  return input.num1**(1 / input.num2)
