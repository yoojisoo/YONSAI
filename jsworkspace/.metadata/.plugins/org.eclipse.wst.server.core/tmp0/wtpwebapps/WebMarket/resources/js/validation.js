function CheckAddProduct() {

	var productId = document.getElementById("productId");
	var name = document.getElementById("name");
	var unitPrice = document.getElementById("unitPrice");
	var unitsInStock = document.getElementById("unitsInStock");
	
	// 상품아아디 체크
	if (!check(/^P[0-9]{4,11}$/, productId,
			"[상품 코드]\nP와 숫자를 조합하여 5~12자까지 입력하세요\n첫 글자는 반드시 P로 시작하세요"))
		return false;
	// 상품명 체크
	if (name.value.length < 4 || name.value.length > 12) {
		alert("[상품명]\n최소 4자에서 최대 50자까지 입력하세요");
		name.select();
		name.focus();
		return false;
	}
	// 상품 가격 체크
	if (unitPrice.value.length == 0 || isNaN(unitPrice.value)) {
		alert("[가격]\n숫자만 입력하세요");
		unitPrice.select();
		unitPrice.focus();
		return false;
	}

	if (unitPrice.value < 0) {
		alert("[가격]\n음수를 입력할 수 없습니다");
		unitPrice.select();
		unitPrice.focus();
		return false;
	} else if (!check(/^\d+(?:[.]?[\d]?[\d])?$/, unitPrice,
			"[가격]\n소수점 둘째 자리까지만 입력하세요"))
		return false;

	// 재고 수 체크
	if (isNaN(unitsInStock.value)) {
		alert("[재고 수]\n숫자만 입력하세요");
		unitsInStock.select();
		unitsInStock.focus();
		return false; //서버로 넘어가지 말라는 false
	}
//                  정규표현식, 대상, 메세지
	function check(regExp, e, msg) {

		if (regExp.test(e.value)) {
			return true;
		}
		//표현식에 맞지않으면 메세지 확인창 출력
		alert(msg);
		e.select(); //텍스트 선택됨(ctrl+a)
		e.focus(); //커서위치 이동 e한테(ID)
		return false;
	}

	 document.newProduct.submit() //제대로했으면 여기까지 내려오겠지? 그럼 submit으로 바로보내버림(버튼클릭이아니라 바로보냄)
	 //newProduct -> form이름임... -> 액션일어나고 -> 프로덕트에드프로덕트로 넘어감
}
