#!/bin/bash

# KotUniL Documentation Build Script
# This script builds versioned Dokka documentation for local verification

set -e  # Exit on any error

echo "🚀 Building KotUniL Documentation..."
echo "========================================"

# Get the current version from build.gradle.kts
VERSION=$(grep 'val kotunilVersion = ' build.gradle.kts | sed 's/.*"\(.*\)".*/\1/')
echo "📦 Building documentation for version: $VERSION"

# Clean previous builds
echo "🧹 Cleaning previous builds..."
./gradlew clean

# Build the documentation
echo "📖 Building Dokka documentation..."
./gradlew buildVersionedDocs

# Create the index page
echo "🔗 Creating documentation index..."
./gradlew createDocsIndex

echo ""
echo "✅ Documentation build completed successfully!"
echo ""
echo "📁 Documentation location: docs/$VERSION/"
echo "🌐 Open docs/index.html in your browser to view the documentation"
echo ""
echo "Available commands:"
echo "  • Local verification: open docs/index.html"
echo "  • Deploy to GitHub Pages: ./gradlew deployToGitHubPages"
echo "  • Remove specific version: ./gradlew removeVersionDocs -Pversion=X.Y.Z"
echo ""
