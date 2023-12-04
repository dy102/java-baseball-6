# class

## domain

- Baseballs : 사용자의 야구게임 숫자를 검증하고 저장하는 역할
- Computer : 야구게임 숫자를 랜덤으로 생성하고, 비교하는 역할

### dto

- BaseballResult : 게임 결과를 저장하는 역할

## service

- BaseballService : domain 로직들을 이용해 더 큰 로직을 구성하는 역할

## controller

- BaseballController : 숫자 야구 게임을 진행하는 역할

## view

- Converter : 입력값을 변환하여 넘겨주는 역할
- Input : 입력받는 역할
- Output : 출력하는 역할

## option

- GameOption : 각종 게임 옵션들을 관리하는 역할
- GameStatus : 게임 상태 enum

## util

- GameManager : 게임 상태를 다루는 역할