<!-- Search results for individual -->

<template>
    <div class="container-fluid">
      <div
        v-for="item of 5"
        class="row result-row align-items-center"
      >
        <div class="col">
          <p class="text-main">
            Иванов Петр Семенович, 20 Сенября 1956г, Пасспорт MP344480, НКБ
            <span class="result-id">
              # 45672
            </span>
          </p>
        </div>
        <div class="col-auto">
          <div class="props d-flex align-items-center justify-content-center">
            <icon-svg icon-name="icon_24_ic_more_vert"/>
          </div>
        </div>
      </div>

      <div class="row">
        <div class="col">
          <p class="pgn">
            <span class="pgn-button">
              <
            </span>
            <span class="pgn-button">
              1
            </span>
            <span class="pgn-button">
              ...
            </span>
            <span
              v-for="pButton of 10"
              :class="{'active': pButton == 3}"
              class="pgn-button"
            >
              {{pButton + 15}}
            </span>
            <span class="pgn-button">
              ...
            </span>
            <span class="pgn-button">
              67
            </span>
            <span class="pgn-button">
              >
            </span>
          </p>
        </div>
      </div>
    </div>
</template>

<script>
    import IconSvg from "@/components/common/icons/IconSvg";
    import SpinnerComponent from "@/components/common/SpinnerComponent";

    export default {
      name: "SearchIndividualResults",
      components: {SpinnerComponent, IconSvg}
    }
</script>

<style lang="scss" scoped>
  @import "../../../../assets/styles/core/core";

  .props {
    height: 36px;
    width: 36px;
    border-radius: 18px;
    cursor: pointer;
    &:hover {
      background-color: $color-main;
    }
  }

  .text-main {
    font-size: 18px;
    font-weight: 600;
    color: $color-text-bold;
    margin-bottom: 0;
  }

  .result-row {
    padding: {
      top: 19px;
      bottom: 19px;
    };
    border-bottom: 1px solid $color-borders;
    &:hover {
      background-color: $color-background;
    }
  }

  .result-id {
    color: $color-main;
    background-color: $color-background-platinum;
    padding: 5px;
    border-radius: 5px;
  }

  .pgn {
    margin-top: 18px;
  }
  .pgn-button {
    display: inline-flex;
    justify-content: center;
    align-items: center;
    width: 44px;
    height: 44px;
    border-radius: 22px;
    background-color: $color-background-white-smoke;
    margin-left: 8px;
    cursor: pointer;
    &.active {
      color: $color-background-white;
      background-color: $color-main;
    }
  }
</style>
