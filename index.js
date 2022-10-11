let button = document.getElementById("general");
let hozzaad = document.getElementById("hozzaad");
let number = document.getElementById("number");

function init(){
	
}

let t = [20];
function tomb(){
	
	for(let i = 0; i < 20; i++){
		t.push(Math.floor(Math.random()*29)+1);
	}

	let t2 = [];
	t.forEach((e) => {
		if(e % 5 == 0){
			t2.push(e);
		}
	})

	console.log(t2);
	labakbolSzazlabu(t);

}

document.addEventListener("DOMContentLoaded",() => {
	tomb();
	general.addEventListener('click', tomb);
	hozzaad.addEventListener('click',()=>{
		t.push(number.value);
	}
	)
})

class Szazlabu{
	labakSzama; 

	constructor(labakSzama){
		this.labakSzama = labakSzama;
	}

	toString(){
		return this.labakSzama + " a lábak száma";
	}
	
}

function labakbolSzazlabu(t){
	let szazlabuTomb = [];

	t.forEach((e) =>{
		let szazlabu = new Szazlabu(e);
		szazlabuTomb.push(szazlabu) 
	})

	szazlabuMegjelenites("megjelenites", szazlabuTomb);
}

function szazlabuMegjelenites(id, szazlabuLista){
	szazlabuLista.forEach((e) =>{
		let li = document.createElement("li");
		li.innerHTML = e.toString();
		let megjelenites = document.getElementById(id);
		megjelenites.appendChild(li);
	})
	

}