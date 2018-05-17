<!-- This is form for searching individual applications. Probably it is temporary. -->

<template>
  <div class="container-fluid cgn-card">
    <div class="row cgn-header">
      <h2 class="col">
        Поиск Физических Лиц
      </h2>
    </div>

    <div class="row">
      <div class="col">
        <form
          class="container-fluid"
          @submit.prevent="search"
        >
          <div class="row">
            <div class="col-6 form-group">
              <label for="fullName">
                Ф.И.О
              </label>
              <input
                id="fullName"
                v-model="searchForm.fullName"
                name="fullName"
                type="text"
                class="form-control"
                placeholder="Ф.И.О"
              />
            </div>
            <div class="col-6 form-group">
              <label for="birthDate">
                Дата рождения
              </label>
              <v-date-picker
                v-model="searchForm.birthDate"
                mode="single"
              >
                <input
                  id="birthDate"
                  name="birthDate"
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

          <div class="row">
            <div class="col-6 form-group">
              <label for="birthPlace">
                Место Рождения
              </label>
              <select
                id="birthPlace"
                v-model="searchForm.birthPlace"
                name="birthPlace"
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
            <div class="col-6 form-group">
              <label for="inn">
                ИНН
              </label>
              <input
                id="inn"
                v-model="searchForm.inn"
                name="inn"
                type="text"
                class="form-control"
                placeholder="ИНН"
              />
            </div>
          </div>

          <div class="row">
            <div class="col-6 form-group">
              <label for="ogrnip">
                ОГРНИП
              </label>
              <input
                id="ogrnip"
                v-model="searchForm.ogrnip"
                name="ogrnip"
                type="text"
                class="form-control"
                placeholder="ОГРНИП"
              />
            </div>
            <div class="col-6 form-group">
              <label for="passport">
                Пасспортные данные
              </label>
              <input
                id="passport"
                v-model="searchForm.passport"
                name="passport"
                type="text"
                class="form-control"
                placeholder="Пасспортные данные"
              />
            </div>
          </div>

          <div class="row">
            <div class="col-6 form-group">
              <label for="address">
                Адрес регистрации / проживания
              </label>
              <input
                id="address"
                v-model="searchForm.address"
                name="address"
                type="text"
                class="form-control"
                placeholder="Адрес регистрации / проживания"
              />
            </div>
            <div class="col-6 form-group">
              <label for="bankAccount">
                Номер банковского счета
              </label>
              <input
                id="bankAccount"
                v-model="searchForm.bankAccount"
                name="bankAccount"
                type="text"
                class="form-control"
                placeholder="Номер банковского счета"
              />
            </div>
          </div>

          <div class="row">
            <div class="col">
              <button
                :style="{'color': isSpinnerVisible ? 'transparent' : ''}"
                type="submit"
                class="btn-cgn btn-cgn-prim btn-cgn-m position-relative"
              >
                Искать
                <spinner-component
                  v-if="isSpinnerVisible"
                  :type="2"
                />
              </button>
            </div>
            <div class="col text-right">
              <button
                class="btn-cgn btn-cgn-second btn-cgn-m"
                @click.prevent="resetForm"
              >
                Очистить Поиск
              </button>
            </div>
          </div>

          <spinner-component
            v-if="isSpinnerVisible"
            :type="1"
          />
        </form>
      </div>
    </div>

    <div class="row results">
      <div class="col">
        <search-individual-results/>
      </div>
    </div>
  </div>
</template>

<script>
    import SearchIndividualResults from "@/components/layout/content/search/SearchIndividualResults";
    import SpinnerComponent from "@/components/common/SpinnerComponent";

    export default {
      name: "SearchIndividual",
      components: {SpinnerComponent, SearchIndividualResults},
      data: function () {
        return {
          searchResults: [
            {
              id: '45672',
              fullName: 'Иванов Петр Семенович',
              birthDate: '20.09.1956',
              passport: 'MP344480',
              others: 'НКБ'
            }
          ],
          searchForm: {
            fullName: null,
            birthDate: null,
            birthPlace: null,
            inn: null,
            ogrnip: null,
            passport: null,
            address: null,
            bankAccount: null
          },
          isSpinnerVisible: false
        }
      },
      methods: {
        resetForm: function () {
          for (const prop in this.searchForm) {
            this.searchForm[prop] = null;
          }
        },
        search: function () {
          this.isSpinnerVisible = true;
        }
      }
    }
</script>

<style lang="scss" scoped>
  form, .results {
    margin-top: 40px;
  }
</style>
