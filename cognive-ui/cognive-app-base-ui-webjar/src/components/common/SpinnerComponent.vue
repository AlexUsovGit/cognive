<!-- This component contains all spinners -->

<template>
  <div class="cgn-spinner d-flex justify-content-center align-items-center">
    <svg
      v-if="type == 1"
      width="100px" height="100px" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"
      viewBox="0 0 100 100" preserveAspectRatio="xMidYMid"
    >
      <g transform="rotate(0 50 50)">
        <rect x="47.5" y="16.5" rx="9.5" ry="3.3000000000000003" width="5" height="15" fill="#000000">
          <animate attributeName="opacity" values="1;0" keyTimes="0;1" dur="1s" begin="-0.875s"
                   repeatCount="indefinite"></animate>
        </rect>
      </g>
      <g transform="rotate(45 50 50)">
        <rect x="47.5" y="16.5" rx="9.5" ry="3.3000000000000003" width="5" height="15" fill="#000000">
          <animate attributeName="opacity" values="1;0" keyTimes="0;1" dur="1s" begin="-0.75s"
                   repeatCount="indefinite"></animate>
        </rect>
      </g>
      <g transform="rotate(90 50 50)">
        <rect x="47.5" y="16.5" rx="9.5" ry="3.3000000000000003" width="5" height="15" fill="#000000">
          <animate attributeName="opacity" values="1;0" keyTimes="0;1" dur="1s" begin="-0.625s"
                   repeatCount="indefinite"></animate>
        </rect>
      </g>
      <g transform="rotate(135 50 50)">
        <rect x="47.5" y="16.5" rx="9.5" ry="3.3000000000000003" width="5" height="15" fill="#000000">
          <animate attributeName="opacity" values="1;0" keyTimes="0;1" dur="1s" begin="-0.5s"
                   repeatCount="indefinite"></animate>
        </rect>
      </g>
      <g transform="rotate(180 50 50)">
        <rect x="47.5" y="16.5" rx="9.5" ry="3.3000000000000003" width="5" height="15" fill="#000000">
          <animate attributeName="opacity" values="1;0" keyTimes="0;1" dur="1s" begin="-0.375s"
                   repeatCount="indefinite"></animate>
        </rect>
      </g>
      <g transform="rotate(225 50 50)">
        <rect x="47.5" y="16.5" rx="9.5" ry="3.3000000000000003" width="5" height="15" fill="#000000">
          <animate attributeName="opacity" values="1;0" keyTimes="0;1" dur="1s" begin="-0.25s"
                   repeatCount="indefinite"></animate>
        </rect>
      </g>
      <g transform="rotate(270 50 50)">
        <rect x="47.5" y="16.5" rx="9.5" ry="3.3000000000000003" width="5" height="15" fill="#000000">
          <animate attributeName="opacity" values="1;0" keyTimes="0;1" dur="1s" begin="-0.125s"
                   repeatCount="indefinite"></animate>
        </rect>
      </g>
      <g transform="rotate(315 50 50)">
        <rect x="47.5" y="16.5" rx="9.5" ry="3.3000000000000003" width="5" height="15" fill="#000000">
          <animate attributeName="opacity" values="1;0" keyTimes="0;1" dur="1s" begin="0s"
                   repeatCount="indefinite"></animate>
        </rect>
      </g>
    </svg>

    <svg
      v-else
      width="50" height="50" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 100 100"
      preserveAspectRatio="xMidYMid" class="lds-dual-ring"
    >
      <circle v-pre cx="50" cy="50" ng-attr-r="{{config.radius}}" ng-attr-stroke-width="{{config.width}}"
              ng-attr-stroke="{{config.stroke}}" ng-attr-stroke-dasharray="{{config.dasharray}}" fill="none"
              stroke-linecap="round" r="32" stroke-width="7" stroke="#ffffff"
              stroke-dasharray="50.26548245743669 50.26548245743669" transform="rotate(195 50 50)">
        <animateTransform attributeName="transform" type="rotate" calcMode="linear" values="0 50 50;360 50 50"
                          keyTimes="0;1" dur="2s" begin="0s" repeatCount="indefinite"></animateTransform>
      </circle>
    </svg>
  </div>
</template>

<script>
    export default {
      name: "SpinnerComponent",
      props: {
        type: {
          required: true,
          type: Number
        }
      }
    }
</script>

<style lang="scss" scoped>
  .cgn-spinner {
    position: absolute;
    top: 0;
    left: 0;
    height: 100%;
    width: 100%;
  }
</style>
