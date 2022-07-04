function convertToRoman(num) {
  let roman = "";
  let index = 0;
  let compare = num%1000;
  let tens = compare%100;
  let single = tens%10;
  if(compare >= 0) {
    index = Math.trunc(num/1000);
    for(var k = 0; k < index; k++) {
      roman += 'M';
    }
  }
  if(compare >= 900 && compare < 1000) {
    roman += 'CM';
  }
  if(compare >= 500 && compare < 900) {
    roman += 'D';
    compare -= 500;
  }
  if(compare >= 400 && compare < 500) {
    roman += 'CD';
    compare-=400;
  }
  if(compare >= 100 && compare < 400) {
    index = Math.trunc(compare/100);
    for(var k = 0; k < index; k++) {
    roman += 'C';
    }
  }
  if(compare%100 > 90 && compare%100 < 100) {
    roman += 'XC';
  }
  if(tens >= 50 && tens <= 90) {
    roman += 'L'
    tens = tens-50;
  }
  if(tens >= 40 && tens < 50) {
    roman += 'XL';
    tens = tens-40;
  }
  if(tens >= 10 && tens < 40) {
    index = Math.trunc(tens/10);
    for(var k = 0; k < index; k++) {
      roman += 'X';
    }
  }
  if(single === 9) {
    roman += 'IX';
  }
  if(single >= 5 && single < 9) {
    roman += 'V';
    single -= 5;
  }
  if(single === 4) {
    roman += 'IV';
  }
  if(single >= 1 && single < 4) {
    for(var k = 0; k < single; k++) {
      roman += 'I';
    }
  }

  console.log(roman)
  return roman;
}

convertToRoman(798);