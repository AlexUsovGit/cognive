<!-- This is application form for individual. Probably it is temporary. -->

<template>
  <form class="app-form container-fluid">

    <div class="row">
      <div class="col">
        <h2>Анкета Физического Лица</h2>
      </div>
    </div>

    <div class="row">
      <div class="col">
        <div class="container-fluid app-form-group">
          <div class="row">
            <div class="col">
              <h2>
                1. ФИО
              </h2>
            </div>
          </div>
          <div class="row">
            <div class="col-4">
              <div class="form-group">
                <label for="lastName">
                  Фамилия
                </label>
                <input
                  type="text"
                  class="form-control"
                  id="lastName"
                  placeholder="Фамилия"
                />
              </div>
            </div>
            <div class="col-4">
              <div class="form-group">
                <label for="firstName">
                  Имя
                </label>
                <input
                  id="firstName"
                  type="text"
                  class="form-control"
                  placeholder="Имя"
                />
              </div>
            </div>
            <div class="col-4">
              <div class="form-group">
                <label for="middleName">
                  Отчество*
                </label>
                <input
                  id="middleName"
                  type="text"
                  class="form-control"
                  placeholder="Отчество (опционально)"
                />
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col">
        <div class="container-fluid app-form-group">
          <div class="row">
            <div class="col">
              <h2>
                2. Дата и Место Рождения
              </h2>
            </div>
          </div>
          <div class="row">
            <div class="col-4">
              <div class="form-group">
                <label for="birthDate">
                  Дата рождения
                </label>
                <!-- ToDo: set up date picker -->
                <v-date-picker
                  mode="single"
                  v-model="birthDate"
                >
                  <input
                    id="birthDate"
                    type="text"
                    class="form-control"
                    placeholder="--.--.---"
                    slot-scope="{ inputValue, updateValue }"
                    :value="inputValue"
                    @input="updateValue($event.target.value, { formatInput: false, hidePopover: false })"
                    @change="updateValue($event.target.value, { formatInput: true, hidePopover: false })"
                  />
                </v-date-picker>
              </div>
            </div>
            <!-- ToDO: Create component for select -->
            <div class="col-4">
              <div class="form-group">
                <label for="birthPlace">
                  Место Рождения
                </label>
                <select
                  id="birthPlace"
                  class="form-control"
                >
                  <option>
                    Место Рождения
                  </option>
                  <option>
                    Беларусь
                  </option>
                  <option>
                    Казахстан
                  </option>
                  <option>
                    США
                  </option>
                  <option>
                    Россия
                  </option>
                  <option>
                    ... другие
                  </option>
                </select>
              </div>
            </div>
            <div class="col-4">
              <div class="form-group">
                <label for="citizenship">
                  Гражданство
                </label>
                <select
                  id="citizenship"
                  class="form-control"
                >
                  <option>
                    Гражданство
                  </option>
                  <option>
                    Беларусь
                  </option>
                  <option>
                    Казахстан
                  </option>
                  <option>
                    США
                  </option>
                  <option>
                    Россия
                  </option>
                  <option>
                    ... другие
                  </option>
                </select>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col">
        <div class="container-fluid app-form-group">
          <div class="row">
            <div class="col">
              <h2>
                3. Документ удостоверяющий личность
              </h2>
            </div>
          </div>
          <div class="row">
            <div class="col-4">
              <div class="form-group">
                <label for="documentType">
                  Тип Документа
                </label>
                <input
                  type="text"
                  class="form-control"
                  id="documentType"
                  placeholder="Тип Документа"
                />
              </div>
            </div>
            <div class="col-4">
              <div class="form-group">
                <label for="documentSeries">
                  Серия
                </label>
                <input
                  type="text"
                  class="form-control"
                  id="documentSeries"
                  placeholder="Серия"
                />
              </div>
            </div>
            <div class="col-4">
              <div class="form-group">
                <label for="documentNumber">
                  Номер
                </label>
                <input
                  type="text"
                  class="form-control"
                  id="documentNumber"
                  placeholder="Номер"
                />
              </div>
            </div>
            <div class="col-4">
              <div class="form-group">
                <label for="documentIssueDate">
                  Дата Выдачи
                </label>
                <v-date-picker
                  mode="single"
                  v-model="documentIssueDate"
                >
                  <input
                    id="documentIssueDate"
                    type="text"
                    class="form-control"
                    placeholder="--.--.---"
                    slot-scope="{ inputValue, updateValue }"
                    :value="inputValue"
                    @input="updateValue($event.target.value, { formatInput: false, hidePopover: false })"
                    @change="updateValue($event.target.value, { formatInput: true, hidePopover: false })"
                  />
                </v-date-picker>
              </div>
            </div>
            <div class="col-4">
              <div class="form-group">
                <label for="documentIssuePlace">
                  Кем Выдан
                </label>
                <input
                  type="text"
                  class="form-control"
                  id="documentIssuePlace"
                  placeholder="Кем Выдан"
                />
              </div>
            </div>
            <div class="col-4">
              <div class="form-group">
                <label for="documentDepartmentCode">
                  Код Подразделения
                </label>
                <input
                  type="text"
                  class="form-control"
                  id="documentDepartmentCode"
                  placeholder="Код Подразделения"
                />
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col">
        <div class="container-fluid app-form-group">
          <div class="row">
            <div class="col">
              <h2>
                4. Контактная Информация
              </h2>
            </div>
          </div>
          <div class="row">
            <div class="col-12">
              <div class="form-group">
                <label for="registrationAddress">
                  Адрес регистрации
                </label>
                <input
                  type="text"
                  class="form-control"
                  id="registrationAddress"
                  placeholder="Адрес регистрации"
                />
              </div>
            </div>
            <div class="col-12">
              <div class="cognive-toggle">
                <input
                  id="isAddressSame"
                  v-model="isAddressSame"
                  name="isAddressSame"
                  type="checkbox"
                  class="cognive-toggle-input"
                >
                <label
                  for="isAddressSame"
                  class="cognive-toggle-label"
                >
                  Адрес регистрации совподает с адресом проживания
                </label>
              </div>
            </div>
            <div
              v-if="!isAddressSame"
              class="col-12"
            >
              <div class="form-group">
                <label for="residenceAddress">
                  Адрес проживания
                </label>
                <input
                  type="text"
                  class="form-control"
                  id="residenceAddress"
                  placeholder="Адрес проживания"
                />
              </div>
            </div>
            <div class="col-4">
              <div class="form-group">
                <label for="email">
                  Email
                </label>
                <input
                  type="email"
                  class="form-control"
                  id="email"
                  placeholder="Email"
                />
              </div>
            </div>
            <div class="col-4">
              <div class="form-group">
                <label for="phone">
                  Телефон
                </label>
                <input
                  type="tel"
                  class="form-control"
                  id="phone"
                  placeholder="Телефон"
                />
              </div>
            </div>
            <div class="col-4">
              <div class="form-group">
                <label for="fax">
                  Факс
                </label>
                <input
                  type="tel"
                  class="form-control"
                  id="fax"
                  placeholder="Факс (опционально)"
                />
              </div>
            </div>
            <div class="col-12">
              <div class="form-group">
                <label for="postAddress">
                  Почтовый адрес
                </label>
                <input
                  type="text"
                  class="form-control"
                  id="postAddress"
                  placeholder="Почтовый адрес"
                />
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col">
        <div class="container-fluid app-form-group">
          <div class="row">
            <div class="col">
              <h2>
                5. Идентификационный Номер плательщика
              </h2>
            </div>
          </div>
          <div class="row">
            <div class="col-12">
              <div class="form-group">
                <label for="inn">
                  Номер плательщика
                </label>
                <input
                  type="text"
                  class="form-control"
                  id="inn"
                  placeholder="ИНН"
                />
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col">
        <div class="container-fluid app-form-group">
          <div class="row">
            <div class="col">
              <h2>
                6. Страховой номер индивидуального лицевого счета застрахованного лица
                в системе обязательного пенсионного страхования (при его наличии)
              </h2>
            </div>
          </div>
          <div class="row">
            <div class="col-12">
              <div class="form-group">
                <label for="insuranceNumber">
                  Страховой Номер
                </label>
                <input
                  type="text"
                  class="form-control"
                  id="insuranceNumber"
                  placeholder="Страховой Номер"
                />
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col">
        <div class="container-fluid app-form-group">
          <div class="row">
            <div class="col">
              <h2>
                7. Отношение к ИПДЛ*
              </h2>
            </div>
          </div>
          <div class="row">
            <div class="col-12">
              <div class="form-group">
                <div class="cognive-check form-check-inline">
                  <input
                    id="isIpdlNo"
                    v-model="isIpdl"
                    name="isIpdl"
                    class="cognive-check-input"
                    type="radio"
                    :value="false"
                  >
                  <label
                    for="isIpdlNo"
                    class="cognive-check-label"
                  >
                    Нет
                  </label>
                </div>
                <div class="cognive-check form-check-inline">
                  <input
                    id="isIpdlYes"
                    v-model="isIpdl"
                    name="isIpdl"
                    class="cognive-check-input"
                    type="radio"
                    :value="true"
                  >
                  <label
                    for="isIpdlYes"
                    class="cognive-check-label"
                  >Да
                  </label>
                </div>
              </div>
            </div>
            <div
              v-if="isIpdl"
              class="col-12"
            >
              <fieldset class="container-fluid">
                <div class="row">
                  <div class="col-6">
                    <div class="form-group">
                      <label for="ipdlNumber">
                        Ф.И.О (заполняется, если ИПДЛ, является родственник)
                      </label>
                      <input
                        type="text"
                        class="form-control"
                        id="ipdlNumber"
                        placeholder="Ф.И.О"
                      />
                    </div>
                  </div>
                  <div class="col-6">
                    <div class="form-group">
                      <label for="ipdlEmployerInfo">
                        Наименование и адрес его работодателя ИПДЛ
                      </label>
                      <input
                        type="text"
                        class="form-control"
                        id="ipdlEmployerInfo"
                        placeholder="Наименование и адрес его работодателя"
                      />
                    </div>
                  </div>
                  <div class="col-6">
                    <div class="form-group">
                      <label for="ipdlPosition">
                        Должность ИПДЛ
                      </label>
                      <input
                        type="text"
                        class="form-control"
                        id="ipdlPosition"
                        placeholder="Должность"
                      />
                    </div>
                  </div>
                  <div class="col-6">
                    <div class="form-group">
                      <label for="ipdlRelation">
                        Степень родства (заполняется. если ИПДЛ, является родственник)
                      </label>
                      <select
                        id="ipdlRelation"
                        class="form-control"
                      >
                        <option>
                          Степень родства
                        </option>
                        <option>
                          Опция 1
                        </option>
                        <option>
                          Опция 2
                        </option>
                        <option>
                          Опция 3
                        </option>
                        <option>
                          Опция 4
                        </option>
                        <option>
                          Иное (уточнить)
                        </option>
                      </select>
                    </div>
                  </div>
                  <div class="col-12">
                    <div class="form-group">
                      <label for="ipdlFinance">
                        Финансовое положение
                      </label>
                      <textarea
                        id="ipdlFinance"
                        class="form-control"
                        rows="12"
                        placeholder="Пояснение"
                      ></textarea>
                    </div>
                  </div>
                </div>
              </fieldset>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col">
        <div class="container-fluid app-form-group">
          <div class="row">
            <div class="col">
              <h2>
                8. Отношение к РПДЛ*
              </h2>
            </div>
          </div>
          <div class="row">
            <div class="col-12">
              <div class="form-group">
                <div class="cognive-check form-check-inline">
                  <input
                    id="isRpdlNo"
                    v-model="isRpdl"
                    name="isRpdl"
                    class="cognive-check-input"
                    type="radio"
                    :value="false"
                  >
                  <label
                    for="isRpdlNo"
                    class="cognive-check-label"
                  >
                    Нет
                  </label>
                </div>
                <div class="cognive-check form-check-inline">
                  <input
                    id="isRpdlYes"
                    v-model="isRpdl"
                    name="isRpdl"
                    class="cognive-check-input"
                    type="radio"
                    :value="true"
                  >
                  <label
                    for="isRpdlYes"
                    class="cognive-check-label"
                  >Да
                  </label>
                </div>
              </div>
            </div>
            <div
              v-if="isRpdl"
              class="col-12"
            >
              <fieldset class="container-fluid">
                <div class="row">
                  <div class="col-6">
                    <div class="form-group">
                      <label for="rpdlNumber">
                        Ф.И.О (заполняется, если ПДЛ, является родственник)
                      </label>
                      <input
                        type="text"
                        class="form-control"
                        id="rpdlNumber"
                        placeholder="Ф.И.О"
                      />
                    </div>
                  </div>
                  <div class="col-6">
                    <div class="form-group">
                      <label for="rpdlEmployerInfo">
                        Наименование и адрес его работодателя ПДЛ
                      </label>
                      <input
                        type="text"
                        class="form-control"
                        id="rpdlEmployerInfo"
                        placeholder="Наименование и адрес его работодателя"
                      />
                    </div>
                  </div>
                  <div class="col-6">
                    <div class="form-group">
                      <label for="rpdlPosition">
                        Должность ПДЛ
                      </label>
                      <input
                        type="text"
                        class="form-control"
                        id="rpdlPosition"
                        placeholder="Должность"
                      />
                    </div>
                  </div>
                  <div class="col-6">
                    <div class="form-group">
                      <label for="rpdlRelation">
                        Степень родства (заполняется. если ПДЛ, является родственник)
                      </label>
                      <select
                        id="rpdlRelation"
                        class="form-control"
                      >
                        <option>
                          Степень родства
                        </option>
                        <option>
                          Опция 1
                        </option>
                        <option>
                          Опция 2
                        </option>
                        <option>
                          Опция 3
                        </option>
                        <option>
                          Опция 4
                        </option>
                        <option>
                          Иное (уточнить)
                        </option>
                      </select>
                    </div>
                  </div>
                  <div class="col-12">
                    <div class="form-group">
                      <label for="rpdlFinance">
                        Финансовое положение
                      </label>
                      <textarea
                        id="rpdlFinance"
                        class="form-control"
                        rows="12"
                        placeholder="Пояснение"
                      ></textarea>
                    </div>
                  </div>
                </div>
              </fieldset>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col">
        <div class="container-fluid app-form-group">
          <div class="row">
            <div class="col">
              <h2>
                9. Наличие бенифициарного владельца
              </h2>
            </div>
          </div>
          <div class="row">
            <div class="col-12">
              <div class="form-group">
                <div class="cognive-check form-check-inline">
                  <input
                    id="isBeneficialNo"
                    v-model="isBeneficial"
                    name="isBeneficial"
                    class="cognive-check-input"
                    type="radio"
                    :value="false"
                  >
                  <label
                    for="isBeneficialNo"
                    class="cognive-check-label"
                  >
                    Нет
                  </label>
                </div>
                <div class="cognive-check form-check-inline">
                  <input
                    id="isBeneficialYes"
                    v-model="isBeneficial"
                    name="isBeneficial"
                    class="cognive-check-input"
                    type="radio"
                    :value="true"
                  >
                  <label
                    for="isBeneficialYes"
                    class="cognive-check-label"
                  >Да
                  </label>
                </div>
              </div>
            </div>
            <div
              v-if="isBeneficial"
              class="col-12"
            >
              <fieldset class="container-fluid">
                <div class="row">
                  <div class="col-6">
                    <div class="form-group">
                      <label for="beneficialName">
                        Ф.И.О (заполняется, если ПДЛ, является родственник)
                      </label>
                      <input
                        type="text"
                        class="form-control"
                        id="beneficialName"
                        placeholder="Ф.И.О"
                      />
                    </div>
                  </div>
                  <div class="col-6">
                    <div class="form-group">
                      <label for="beneficialCitizenship">
                        Гражданство
                      </label>
                      <select
                        id="beneficialCitizenship"
                        class="form-control"
                      >
                        <option>
                          Гражданство
                        </option>
                        <option>
                          Беларусь
                        </option>
                        <option>
                          Казахстан
                        </option>
                        <option>
                          США
                        </option>
                        <option>
                          Россия
                        </option>
                        <option>
                          ... другие
                        </option>
                      </select>
                    </div>
                  </div>
                  <div class="col-4">
                    <div class="form-group">
                      <label for="beneficialDocumentType">
                        Тип Документа
                      </label>
                      <input
                        type="text"
                        class="form-control"
                        id="beneficialDocumentType"
                        placeholder="Тип Документа"
                      />
                    </div>
                  </div>
                  <div class="col-4">
                    <div class="form-group">
                      <label for="beneficialDocumentSeries">
                        Серия
                      </label>
                      <input
                        type="text"
                        class="form-control"
                        id="beneficialDocumentSeries"
                        placeholder="Серия"
                      />
                    </div>
                  </div>
                  <div class="col-4">
                    <div class="form-group">
                      <label for="beneficialDocumentNumber">
                        Номер
                      </label>
                      <input
                        type="text"
                        class="form-control"
                        id="beneficialDocumentNumber"
                        placeholder="Номер"
                      />
                    </div>
                  </div>
                  <div class="col-4">
                    <div class="form-group">
                      <label for="beneficialDocumentIssueDate">
                        Дата Выдачи
                      </label>
                      <v-date-picker
                        mode="single"
                        v-model="beneficialDocumentIssueDate"
                      >
                        <input
                          id="beneficialDocumentIssueDate"
                          type="text"
                          class="form-control"
                          placeholder="--.--.---"
                          slot-scope="{ inputValue, updateValue }"
                          :value="inputValue"
                          @input="updateValue($event.target.value, { formatInput: false, hidePopover: false })"
                          @change="updateValue($event.target.value, { formatInput: true, hidePopover: false })"
                        />
                      </v-date-picker>
                    </div>
                  </div>
                  <div class="col-4">
                    <div class="form-group">
                      <label for="beneficialDocumentIssuePlace">
                        Кем Выдан
                      </label>
                      <input
                        type="text"
                        class="form-control"
                        id="beneficialDocumentIssuePlace"
                        placeholder="Кем Выдан"
                      />
                    </div>
                  </div>
                  <div class="col-4">
                    <div class="form-group">
                      <label for="beneficialDocumentDepartmentCode">
                        Код Подразделения
                      </label>
                      <input
                        type="text"
                        class="form-control"
                        id="beneficialDocumentDepartmentCode"
                        placeholder="Код Подразделения"
                      />
                    </div>
                  </div>
                  <div class="col-12">
                    <div class="form-group">
                      <label for="beneficialMigrationInfo">
                        Данные миграционной карты, или иного документа подтверждающие право на пребывание в РФ
                      </label>
                      <input
                        type="text"
                        class="form-control"
                        id="beneficialMigrationInfo"
                        placeholder="Данные миграционной карты"
                      />
                    </div>
                  </div>
                  <div class="col-6">
                    <div class="form-group">
                      <label for="beneficialAddress">
                        Адрес места жительства (места пребывания)
                      </label>
                      <input
                        type="text"
                        class="form-control"
                        id="beneficialAddress"
                        placeholder="Адрес места"
                      />
                    </div>
                  </div>
                  <div class="col-6">
                    <div class="form-group">
                      <label for="beneficialInn">
                        ИНН
                      </label>
                      <input
                        type="text"
                        class="form-control"
                        id="beneficialInn"
                        placeholder="ИНН"
                      />
                    </div>
                  </div>
                </div>
              </fieldset>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col">
        <div class="container-fluid app-form-group">
          <div class="row">
            <div class="col">
              <h2>
                10. Характер деловых отнашений с банком
              </h2>
            </div>
          </div>
          <div class="row">
            <div class="col-12">
              <div class="form-group">
                <div class="cognive-check">
                  <input
                    id="relationshipWithBankType1"
                    class="cognive-check-input"
                    type="checkbox"
                  >
                  <label
                    for="relationshipWithBankType1"
                    class="cognive-check-label"
                  >
                    Вкладные операции
                  </label>
                </div>
                <div class="cognive-check">
                  <input
                    id="relationshipWithBankType2"
                    class="cognive-check-input"
                    type="checkbox"
                  >
                  <label
                    for="relationshipWithBankType2"
                    class="cognive-check-label"
                  >
                    Рассчетно-кассовое обслуживание
                  </label>
                </div>
                <div class="cognive-check">
                  <input
                    id="relationshipWithBankType3"
                    class="cognive-check-input"
                    type="checkbox"
                  >
                  <label
                    for="relationshipWithBankType3"
                    class="cognive-check-label"
                  >
                    Кредиты
                  </label>
                </div>
                <div class="cognive-check">
                  <input
                    id="relationshipWithBankType4"
                    class="cognive-check-input"
                    type="checkbox"
                  >
                  <label
                    for="relationshipWithBankType4"
                    class="cognive-check-label"
                  >
                    Брокерское обслуживание
                  </label>
                </div>
                <div class="cognive-check">
                  <input
                    id="relationshipWithBankType5"
                    v-model="relationshipWithBankOther"
                    class="cognive-check-input"
                    type="checkbox"
                  >
                  <label
                    for="relationshipWithBankType5"
                    class="cognive-check-label"
                  >
                    Иное (указать)
                  </label>
                </div>
              </div>
            </div>
            <div
              v-if="relationshipWithBankOther"
              class="col-12"
            >
              <div class="form-group">
                <label for="relationshipWithBank">
                  Отношения с банком
                </label>
                <textarea
                  id="relationshipWithBank"
                  class="form-control"
                  rows="12"
                  placeholder="Пояснение"
                ></textarea>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col">
        <div class="container-fluid app-form-group">
          <div class="row">
            <div class="col">
              <h2>
                11. Сведения о целях финансово-хозяйственной деятельности
              </h2>
            </div>
          </div>
          <div class="row">
            <div class="col-12">
              <div class="form-group">
                <div class="cognive-check">
                  <input
                    id="purposes1"
                    class="cognive-check-input"
                    type="checkbox"
                  >
                  <label
                    for="purposes1"
                    class="cognive-check-label"
                  >
                    Опция А
                  </label>
                </div>
                <div class="cognive-check">
                  <input
                    id="purposes2"
                    class="cognive-check-input"
                    type="checkbox"
                  >
                  <label
                    for="purposes2"
                    class="cognive-check-label"
                  >
                    Опция Б
                  </label>
                </div>
                <div class="cognive-check">
                  <input
                    id="purposes3"
                    v-model="purposesOther"
                    class="cognive-check-input"
                    type="checkbox"
                  >
                  <label
                    for="purposes3"
                    class="cognive-check-label"
                  >
                    Иное (указать)
                  </label>
                </div>
              </div>
            </div>
            <div
              v-if="purposesOther"
              class="col-12"
            >
              <div class="form-group">
                <label for="purposes">
                  Отношения с банком
                </label>
                <textarea
                  id="purposes"
                  class="form-control"
                  rows="12"
                  placeholder="Пояснение"
                ></textarea>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col">
        <div class="container-fluid app-form-group">
          <div class="row">
            <div class="col">
              <h2>
                12. Сведения о финансовом положении
              </h2>
            </div>
          </div>
          <div class="row">
            <div class="col-12">
              <div class="form-group">
                <label for="financialPosition">
                  Финансовое положение
                </label>
                <textarea
                  id="financialPosition"
                  class="form-control"
                  rows="12"
                  placeholder="Пояснение"
                ></textarea>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col">
        <div class="container-fluid app-form-group">
          <div class="row">
            <div class="col">
              <h2>
                13. Сведения о деловой репутации
              </h2>
            </div>
          </div>
          <div class="row">
            <div class="col-12">
              <div class="form-group">
                <label for="reputation">
                  Финансовое положение
                </label>
                <textarea
                  id="reputation"
                  class="form-control"
                  rows="12"
                  placeholder="Пояснение"
                ></textarea>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col">
        <div class="container-fluid app-form-group">
          <div class="row">
            <div class="col">
              <h2>
                14. Сведения об источниках происхождения денежных средств и (или) иного имущества
              </h2>
            </div>
          </div>
          <div class="row">
            <div class="col-12">
              <div class="form-group">
                <div class="cognive-check">
                  <input
                    id="sources1"
                    class="cognive-check-input"
                    type="checkbox"
                  >
                  <label
                    for="sources1"
                    class="cognive-check-label"
                  >
                    Личные накопления
                  </label>
                </div>
                <div class="cognive-check">
                  <input
                    id="sources2"
                    class="cognive-check-input"
                    type="checkbox"
                  >
                  <label
                    for="sources2"
                    class="cognive-check-label"
                  >
                    Заработная плата
                  </label>
                </div>
                <div class="cognive-check">
                  <input
                    id="sources3"
                    class="cognive-check-input"
                    type="checkbox"
                  >
                  <label
                    for="sources3"
                    class="cognive-check-label"
                  >
                    Кредиты
                  </label>
                </div>
                <div class="cognive-check">
                  <input
                    id="sources4"
                    class="cognive-check-input"
                    type="checkbox"
                  >
                  <label
                    for="sources4"
                    class="cognive-check-label"
                  >
                    Кредитные средства
                  </label>
                </div>
                <div class="cognive-check">
                  <input
                    id="sources5"
                    class="cognive-check-input"
                    type="checkbox"
                  >
                  <label
                    for="sources5"
                    class="cognive-check-label"
                  >
                    Наследство
                  </label>
                </div>
                <div class="cognive-check">
                  <input
                    id="sources6"
                    v-model="sourcesOther"
                    class="cognive-check-input"
                    type="checkbox"
                  >
                  <label
                    for="sources6"
                    class="cognive-check-label"
                  >
                    Иное (указать)
                  </label>
                </div>
              </div>
            </div>
            <div
              v-if="sourcesOther"
              class="col-12"
            >
              <div class="form-group">
                <label for="sources">
                  Отношения с банком
                </label>
                <textarea
                  id="sources"
                  class="form-control"
                  rows="12"
                  placeholder="Пояснение"
                ></textarea>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

  </form>
</template>

<script>
  export default {
    name: "ApplicationForIndividual",
    data: function () {
      return {
        birthDate: null,
        documentIssueDate: null,
        beneficialDocumentIssueDate: null,
        isAddressSame: false,
        isIpdl: false,
        isRpdl: false,
        isBeneficial: false,
        relationshipWithBankOther: false,
        purposesOther: false,
        sourcesOther: false
      }
    }
  }
</script>

<style lang="scss" scoped>
  @import "../../../../assets/styles/core/core";

  .app-form {
    background-color: $color-background-white;
    border-radius: 12px;
    box-shadow: 0 2px 4px 0 rgba(0, 0, 0, 0.5);
    & > .row:first-of-type {
      border-bottom: 1px solid $color-borders;
      padding-top: 40px;
    }
  }
  .app-form-group {
    margin: {
      top: 16px;
      bottom: 16px;
    }
    padding-top: 16px;
    &:focus-within {
      background-color: $color-background-platinum;
      border-radius: 8px;
    }
  }
</style>
