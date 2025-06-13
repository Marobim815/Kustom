# Kustom
---

---

**Mod Generation DSL for Fabric Mod dev**

> Fabric API 기반 자동 등록 시스템  
> 현재 개발 초기 단계입니다.

---

## Features

- 📦 아이템, 블록, 툴 등 자동 등록 (Auto Registration)
- 🧾 `lang.json`, `model.json`, `blockstates.json`, `recipes.json` 자동 생성
- 🧠 직관적인 Kotlin DSL 사용
- 🔄 자동 텍스처 복사 및 경로 정리 (예정)

---

##Supported Minecraft Versions

- `1.21.5`

---

##Motivation

Fabric 기반 모드 개발은 반복 작업이 많습니다.  
`Item`, `Block`을 등록하고, 관련 `JSON`, `lang`, `model`, `blockstates` 등을 하나하나 작성해야 합니다.  
이런 일은 개발자의 시간을 낭비시키고, **실제 게임 컨텐츠 개발에 집중하지 못하게 만듭니다.**

Kustom은 이러한 반복 작업을 줄이고, **한 줄 DSL**로 자동 생성되도록 하기 위해 만들어졌습니다.

```kotlin
items {
    item("ruby_sword") {
        displayName = "루비 검"
        texture = "ruby_sword"
        maxCount = 1
        attackDamage = 7.0
    }
}
```

위 코드를 통해 다음이 자동 생성됩니다:
	•	models/item/ruby_sword.json
	•	lang/en_us.json
	•	텍스처 경로 자동 복사 (지원 예정)

⸻

##Gradle

```kts
repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.yourname:kustom:<version>")
}
```

⸻

##DSL Example

```kt
kustom {
    items {
        item("ruby_sword") {
            displayName = "루비 검"
            texture = "ruby_sword"
            maxCount = 1
            attackDamage = 7.0
        }
    }

    blocks {
        block("ruby_block") {
            displayName = "루비 블록"
            material = Material.METAL
            hardness = 5.0f
            texture = "ruby_block"
        }
    }
}
```

⸻


##License

**GPL-3.0 License**
이 프로젝트의 코드 및 결과물은 다음 사항을 따릅니다:
	•	변경 또는 삭제 금지
	•	사용 시 원작자 표기 필수

⸻

👥 Contributors

이름	기여 내용

⸻

**Roadmap**
	•	아이템 DSL
	•	블록 DSL
	•	Lang, Model JSON 자동 생성
	•	툴/방어구/음식 DSL
	•	Entity DSL
	•	GUI DSL
	•	Dimension DSL
	•	Command DSL (Kommand 스타일)
	•	Custom Enchant DSL
	•	텍스처 자동 복사기