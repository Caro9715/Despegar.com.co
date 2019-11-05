#Author: carolina

Feature: Reserve a vuelo in Despegar.com

I as a user
I want to search and reserve a flight from Medellin to Bogota
In Despegar.com


Scenario Outline: reserve a flight from Medellin to Bogota
	Given that Carolina wants search and reserve a flight
	When  enter the data 
	
	| <Nombre>   | <Apellido>   | <Cedula>   | <Ciudad>   | <Direccion>   | <Email>   | <Area>   | <Numero> |
	Then  I should see the data correctly on the screen
	Examples: 
	|	Nombre	  |	Apellido	|	   Cedula    | 	Ciudad	 | Direccion  | Email                | Area  | Numero     |
	| Carolina  | Pareja    | 123456789	 | Medellin  | Carrera 93 | carolina@hotmail.com | 57    | 3217725416 |