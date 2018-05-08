<!-- Base component for all icons.
It uses template witch is common for all SVG file and supplements it with unique data from external JSON file -->

<template>
  <svg
    xmlns="http://www.w3.org/2000/svg"
    :width="iconWidth"
    :height="iconHeight"
    viewBox="0 0 24 24"
    class="icon-svg"
  >
    <defs>
      <path
        :id="aId"
        :d="iconData"
      ></path>
    </defs>
    <g
      fill="none"
      fill-rule="evenodd"
    >
      <mask
        :id="bId"
        fill="#fff"
      >
        <use :xlink:href="aRef"></use>
      </mask>
      <g
        :fill="iconColor"
        :mask="bUrl"
        class="on-hover"
      >
        <rect
          :width="iconWidth"
          :height="iconHeight"
        ></rect>
      </g>
    </g>
  </svg>
</template>

<script>
  import IconList from "./IconList"

  export default {
    name: "IconSvg",
    props: {
      iconName: {
        type: String,
        required: true
      },
      iconWidth: {
        type: [Number, String],
        default: 24
      },
      iconHeight: {
        type: [Number, String],
        default: 24
      },
      iconColor: {
        type: String,
        default: '#C7C7CC'
      }
    },
    computed: {
      // Variable with unique data for SVG
      iconData: function () {
        return this.getIconData(this.iconName)
      },
      aId: function () {
        return this.iconName + '-a'
      },
      aRef: function () {
        return '#' + this.iconName + '-a'
      },
      bId: function () {
        return this.iconName + '-b'
      },
      bUrl: function () {
        return 'url(#' + this.iconName + '-b)'
      }
    },
    methods: {
      // This function fetches SVG icon data from JSON config file
      getIconData: function (name) {
        let data = IconList.find(
          item => item.name === name.trim()
        );

        return data.data;
      }
    }
}
</script>

<style lang="scss" scoped>
  @import "../../../assets/styles/core/core";

  .icon-svg {
    display: inline-block;
    vertical-align: middle;
    cursor: pointer;
  }
  .on-hover:hover {
    fill: $color-main;
  }
  // Styles for menu items, tabs. They solve case then item is active or item is hovered.
  .menu-item:hover, .router-link-active, .tab:hover, .active {
    .on-hover {
      fill: $color-main;
    }
  }
</style>
