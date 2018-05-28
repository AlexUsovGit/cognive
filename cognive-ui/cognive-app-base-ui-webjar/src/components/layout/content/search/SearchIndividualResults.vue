<!-- Search results for individual -->

<template>
    <div class="container-fluid">
      <div
        v-for="result of searchResults"
        :key="'result' + result.id"
        class="row result-row align-items-center"
        @click="redirectToIndividual(result.id)"
      >
        <div class="col">
          <p class="text-main">
            {{result.firstName}} {{result.lastName}},
            {{result.birthDate | dateFormat}},
            {{result.documents[0] && result.documents[0].documentType}}
            {{result.documents[0] && result.documents[0].documentSeries}}{{result.documents[0] && result.documents[0].documentNumber}},
            НКБ
            <span class="result-id">
              # {{result.id}}
            </span>
          </p>
        </div>
        <div class="col-auto">
          <div
            class="props d-flex align-items-center justify-content-center"
            @click.stop="openSettings(result.id)"
          >
            <icon-svg icon-name="icon_24_ic_more_vert"/>
          </div>
        </div>
      </div>

      <div class="row">
        <div class="col">
          <p class="pgn">
            <span
              class="pgn-button"
              @click="pagination(page.page - 1)"
            >
              <
            </span>
            <!-- ToDo: add this after total has been fixed -->
            <!--
            <span
              class="pgn-button"
            >
              1
            </span>
            <span
              class="pgn-button"
            >
              ...
            </span>
            <span
              v-for="pButton of 10"
              :class="{'active': pButton == 3}"
              class="pgn-button"
            >
              {{pButton + 15}}
            </span>
            <span
              class="pgn-button"
            >
              ...
            </span>
            <span
              class="pgn-button"
            >
              67
            </span>
            -->
            <span
              class="pgn-button"
              @click="pagination(page.page + 1)"
            >
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
      components: {SpinnerComponent, IconSvg},
      props: {
        searchResults: {
          required: true,
          type: Array
        },
        page: {
          required: true,
          type: Object
        }
      },
      data: function() {
        return {}
      },
      computed: {},
      methods: {
        redirectToIndividual: function (id) {
          this.$router.push({name: 'ApplicationWithId', params: {id}});
        },
        openSettings: function (id) {
          console.log('You open settings to result with id:' + id)
        },
        pagination: function (pageNumber) {
          if (pageNumber < 0) {
            pageNumber = this.page.page;
          }

          this.$emit('pagination', pageNumber);
        }
      }
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
